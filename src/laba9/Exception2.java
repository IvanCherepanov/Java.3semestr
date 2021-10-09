package laba9;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
//задание 2 -
//Листинг 3 -
//Qwerty - Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
// 0     - Exception in thread "main" java.lang.ArithmeticException: / by zero
// 1.2   - Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
// 1     - исключения нет, вывод 2
public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }
        catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException);
            System.out.println("can't format for input string: "+"'"+intString+"'");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
            System.out.println("Attempted division by zero");
        }

    }

    public static void main(String[] args) {
        Exception2 exception2=new Exception2();
        exception2.exceptionDemo();
    }
}
