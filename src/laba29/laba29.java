package laba29;
//Классы для работы с датой и временем в Java 8 в формате 24
//Java предоставляет класс Date, который доступен в пакете java.util, этот класс заключает в себе текущую дату и время.
//LocalDate. Позволяет работать только с датами, без времени.
//LocalTime. Позволяет работать только со временем, без дат.
//LocalDateTime. Позволяет работать и с датами, и с временем.
//Calendar является абстрактным классом. Единственная реализация — GregorianCalendar.
//предоставляет методы установки значений различных полей вроде YEAR, MONTH, DAY_OF_MONTH, HOUR и т. д,
// манипуляции этими полями, например добавление дня или месяца. Дата и время представляется количеством миллисекунд, прошедших с 1 января 1970 года 00:00:00.000 GMT.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Общие сведения для работы с датой и временем в Java 8
//однако сейчас все методы класса Date не рекомендованы к использованию, а юзают Calendar
//Более развитые средства для работы с датами представляет класс Calendar(абстрактным классом).
//Для считывания, установки манипуляции различных "частей" даты
//используются методы get(int filed), set(int filed, int value), add(int field, int amount),
//roll(int field, inr amount), переменная типа int с именем filed указывает на номер поля
//с которым нужно произвести операцию. Для удобства все эти поля определены в
//Calendar, как статические константы типа int.
public class laba29 {
    public static boolean checkDate(String s){
        Pattern pattern=Pattern.compile("((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|" +
                "((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|" +
                "(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))");//делаем в паттерне регулярное выражение из
        Pattern pattern1=Pattern.compile("(^(((0[1-9]|1[0-9]|2[0-8])" +//дата от 0 до 9 ИЛИ от 10 до 19 ИЛИ от 20 до 28; т.к 29-февраль особый случай, а 30 и 31 зависит от месяца
                "[\\/](0[1-9]|1[012]))|" + //месяц для обычного случая(не граничного)+сюда же обычный февраль
                "((29|30|31)[\\/](0[13578]|1[02]))" +//вариант с 31 днем бывает только января, марта, мая, июля, августа, октября, декабря
                "|((29|30)[\\/](0[4,6,9]|11)))" + //вариант с 30 днями у Апреля, Июня, Сентября и Ноября
                "[\\/](19|[2-9][0-9])\\d\\d$)|" +//варианты года от 1900 до 9999 в обычном случае(не високосном)
                "(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)");//отдельная правка високосного года
        Matcher matcher=pattern1.matcher(s);//matches() – проверяет, соответствует ли вся строка шаблону;
        boolean flag=matcher.find();//пытается найти последовательность символов, соответствующих шаблону,
        return flag;//в любом месте строки

    }

    /**
     If unquoted, it may use any of these ASCII characters:
         uppercase and lowercase Latin letters A to Z and a to z
         digits 0 to 9
         printable characters !#$%&'*+-/=?^_`{|}~
         dot ., provided that it is not the first or last character and provided also that it does not appear consecutively
    domain:The domain name part of an email address has to conform to strict guidelines: it must match the requirements for a hostname, a list of dot-separated DNS labels, each label being limited to a length of 63 characters and consisting of:[5]: §2 
         uppercase and lowercase Latin letters A to Z and a to z;
         digits 0 to 9, provided that top-level domain names are not all-numeric;
         hyphen -, provided that it is not the first or last character.
     Полное доменное имя состоит из непосредственного имени домена и далее имён всех доменов, в которые он входит,
     разделённых точками. Например, полное имя ru.wikipedia.org. обозначает домен третьего уровня ru, который входит
     в домен второго уровня wikipedia, который входит в домен верхнего уровня org, который входит в безымянный корневой домен .
     (точка). В обыденной речи под доменным именем нередко понимают именно полное доменное имя.
     */
    public static boolean checkEmail(String s){
        Pattern pattern=Pattern.compile("([a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]){1,512}@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+");//
        Matcher matcher=pattern.matcher(s);//matches() – проверяет, соответствует ли вся строка шаблону;
        boolean flag=matcher.find();//пытается найти последовательность символов, соответствующих шаблону,
        return flag;//в любом месте строки
    }
    public static void main(String[] args) {
        System.out.println(checkDate("29/02/2000"));
        System.out.println(checkDate("30/04/2003"));
        System.out.println(checkDate("01/01/2003"));
        System.out.println(checkDate("29/02/2001"));
        System.out.println(checkDate("30-04-2003"));
        System.out.println(checkDate("1/1/1899"));
        System.out.println("Next Program");
        System.out.println(checkEmail("user@example.com"));
        System.out.println(checkEmail("root@localhost"));
        System.out.println(checkEmail("myhost@@@com.ru"));
        System.out.println(checkEmail("@my.ru"));
        System.out.println(checkEmail("Julia String"));
        System.out.println(checkEmail("John.Doe.@example.com"));

    }
//dd/mm/yyyy. Начиная с 1900 года до 9999 года.
//пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
//пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899
}