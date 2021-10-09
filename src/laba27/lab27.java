package laba27;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab27 {
    public static void main(String[] args) {

    // разбиение строки на подстроки с применением шаблона в качестве разделителя
    //разбиение по пробелам
    System.out.println("By steps");
    Pattern p3 = Pattern.compile("\\s");
    String[] words = p3.split("java5tiger 77 java6mustang");
    for (String word : words) {
        System.out.println(word);
    }

    //разбиение по цифрам
    System.out.println("\nBy numbers");
    Pattern p4 = Pattern.compile("\\d");
    String[] words1 = p4.split("java5tiger 77 java6mustang");
    for (String word : words1) {
        System.out.println(word);
    }

    //использование replace
    System.out.println("\nReplace");
    System.out.println("java5tiger 77 java6mustang".replaceAll("\\d", ""));

    System.out.println("\nPart2");
    System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
    System.out.println(isThatStr("asdzfghd4yt5y5"));

}
    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

}