package laba24;

import java.util.Scanner;
//появляется ошибка
//Exception 'java.lang.NumberFormatException' has already been caught
//т.к мы уже "отловили более общее исключение"
public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }
        catch (Exception exception){
            System.out.println(exception);
            System.out.println("We catch error with "+ intString);
        }
        /*catch (NumberFormatException numberFormatException){
            System.out.println("can't format for input string: "+"'"+intString+"'");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Attempted division by zero");
        }*/

    }

    public static void main(String[] args) {
        Exception3 exception3=new Exception3();
        exception3.exceptionDemo();
    }
}
