package laba09;
// Непроверяемые исключения чаще всего являются следствием ошибок программиста.  Непроверяемые исключения - это исключения времени выполнения
//1)Наличие\обработка Checked исключения проверяются на этапе компиляции.
//
//2) Наличие\обработка Unchecked исключения происходит на этапе выполнения.
public class Test {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("1234324321"," Ivanov Ivan Ivanovich");
        Cabinet.Check(cabinet);
        Cabinet cabinet2 = new Cabinet("1234324gfd321"," Petrov Petr");
        Cabinet.Check(cabinet2);
    }
}
