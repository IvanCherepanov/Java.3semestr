package laba30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class laba30 {
    /**
     Проверить, надежно ли составлен пароль. Пароль считается надежным, если он
     состоит из 8 или более символов. Где символом может быть
         цифр
         английская буква
         и знак подчеркивания.
     Пароль должен содержать хотя бы
         !одну заглавную букву
         !одну маленькую букву
         !одну цифру.
     – пример правильных выражений: F032_Password, TrySpy1.
     – пример неправильных выражений: smart_pass, A007.
     */
    public static boolean checkPassword(String s){
        Pattern pattern=Pattern.compile("(?=.*[0-9])" +         //хотя бы 1 цифра
                                        "(?=.*[a-z])" +         //хотя бы 1 строчная
                                        "(?=.*[A-Z])" +         //хотя бы 1 заглавная
                                        "[0-9a-zA-Z_]" +        //цифры+англиские стр+загл
                                        "{8,}");//              //минимум 8
        Matcher matcher=pattern.matcher(s);//matches() – проверяет, соответствует ли вся строка шаблону;
        boolean flag=matcher.find();//пытается найти последовательность символов, соответствующих шаблону,
        return flag;//в любом месте строки
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("F032_Password"));
        System.out.println(checkPassword("TrySpy1"));
        System.out.println(checkPassword("smart_pass"));
        System.out.println(checkPassword("A007"));
        System.out.println(checkPassword("F032 Password"));
    }
}
