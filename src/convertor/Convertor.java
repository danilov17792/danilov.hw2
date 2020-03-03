package convertor;
import exception.MyArrayDataException;
import exception.MyArraySizeException;
public class Convertor {

    public static int strConvertor(String[][] arg) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != arg.length) throw new MyArraySizeException();

        for (int i = 0; i < arg.length; i++) {

            if (4 != arg[i].length) throw new MyArraySizeException();

            for (int j = 0; j < arg[i].length; j++) {

                try {
                    sum += Integer.parseInt(arg[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}


