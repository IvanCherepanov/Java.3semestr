package laba24;
//Листинг 4
//первый вывод: Exception in thread "main" java.lang.NullPointerException: null key in getDetails
//	at laba9.ThrowsDemo.getDetails(ThrowsDemo.java:6)
//	at laba9.ThrowsDemo.main(ThrowsDemo.java:13)
//Этот способ не является подходящим для работы с этим исключением, т.к не ясен контекст????
// Программа проверяет равенство нулю и выбрастывает исключение
//ловим исключение и выводим его текст
public class ThrowsDemo {
    public void getDetails(String key) {

        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
        }
        catch (NullPointerException nullPointerException){
            System.out.println("I catch ");
            System.out.println(nullPointerException.getMessage());
        }
        // do something with the key
    }


    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getDetails(null);
        System.out.println("___________");
        ThrowsDemo1 throwsDemo1 = new ThrowsDemo1();
        throwsDemo1.printMessage(null);
        throwsDemo1.printMessage("12");
    }
}
 class ThrowsDemo1 {
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException);
            System.out.println("I catch NullPointerException:: "+nullPointerException.getMessage());
            //System.out.println(nullPointerException.getMessage());
        }
        return "data for " + key;
    }
}
