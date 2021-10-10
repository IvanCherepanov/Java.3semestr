package laba24;
//задание 1 - ничего не произойдет т.к нет вызова, это просто класс
//Листинг 1 - 2.0 / 0.0 -> Infinity выпадет т.к это определило IEEE 754
//Листинг 2 - теперь выводит Attempted division by zero
public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println(e);
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 exception1=new Exception1();
        exception1.exceptionDemo();
    }
}

