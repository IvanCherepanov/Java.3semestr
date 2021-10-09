package laba28;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
//– пример правильных выражений: 25.98 USD.
//– пример неправильных выражений: 44 ERR, 0.004 EU
public class lab28 {

    public static ArrayList<String> checkMoney(String s){
        Pattern pp=Pattern.compile("(^|[\\s]|[^\\w\\.])" +  //1. или начало строки, или пробел, или не какие-то символы перед точкой
                "([0-9]\\d*(\\.\\d{1,2})?\\s*(USD|EU|RUB))"); //2. последовательность любая цифр+точка+ 1 или 2 знаковых+пробелы+выбор валют
        Matcher m = pp.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
    public static boolean checkPlus(String s){
        Pattern pattern=Pattern.compile("\\(?\\d+\\s*\\+\\s*\\d+\\s*\\)?");//делаем в паттерне регулярное выражение из
        Matcher matcher=pattern.matcher(s);//matches() – проверяет, соответствует ли вся строка шаблону;
        boolean flag=matcher.find();//пытается найти последовательность символов, соответствующих шаблону,
        return flag;//в любом месте строки
    }

    public static void main(String[] args) {
        System.out.println(checkMoney("342.3 RUB, 342.32 RUB 423 EU dsfrg 3.789 USD 12 RUB"));
        System.out.println(checkMoney("25.98 USD 44 ERR, 0.004 EU"));
        System.out.println("There are: ");
        System.out.println(checkPlus("(1 + 8) – 9 / 4"));
        System.out.println(checkPlus("4243+43"));
        System.out.println(checkPlus("6 / 5 – 2 * 9"));
        System.out.println("There are not: ");
        System.out.println(!checkPlus(" (1 + 8) – 9 / 4"));
        System.out.println(!checkPlus("4243+43"));
        System.out.println(!checkPlus(": 6 / 5 – 2 * 9"));

    }
}
