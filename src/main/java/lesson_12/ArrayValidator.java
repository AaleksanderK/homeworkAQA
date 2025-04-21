package lesson_12;

public class ArrayValidator {

    public static int validateAndSumArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {
        validateArraySize(array);

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return sum;
    }

    static void validateArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Количество строк должно быть 4, получено: " + array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException(
                        String.format("Строка %d должна содержать 4 элемента, получено: %s",
                                i, array[i] == null ? "null" : array[i].length)
                );
            }
        }
    }
}