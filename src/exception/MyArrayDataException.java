package exception;

public class MyArrayDataException extends AllException{
    public MyArrayDataException(int row, int column) {
        super(String.format("Ошибка значения в [%d, %d]", row, column));
    }
}

