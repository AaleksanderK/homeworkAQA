package lesson_12;

public class MyArraySizeException extends Exception{

    public MyArraySizeException() {
        super("Неверный размер массива.");
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
