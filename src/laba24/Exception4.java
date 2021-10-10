package laba24;

import java.util.Scanner;
//блок finally выполняется всегда, независимо от исключения
public class Exception4 {
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
        finally {
            System.out.println("It is finally code");
        }

    }

    public static void main(String[] args) {
        Exception4 exception4=new Exception4();
        exception4.exceptionDemo();
    }
}
