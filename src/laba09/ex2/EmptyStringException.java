package laba09.ex2;

public class EmptyStringException extends Exception{
    public EmptyStringException() {
        super("Передана пустая строка!");
    }
}
