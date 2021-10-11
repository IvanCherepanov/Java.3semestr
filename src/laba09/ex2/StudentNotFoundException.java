package laba09.ex2;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message) {
        super("Студент "+ message + " не найден!");
    }
}
