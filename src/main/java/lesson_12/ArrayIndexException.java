package lesson_12;


public class ArrayIndexException {

    public static void demo() {

        int[] numbers = {1, 2, 3};

        try {
            System.out.println("\nПопытка доступа к numbers[3]:");
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
            System.out.println("Сообщение: " + e.getMessage());
        }


        int[][] matrix = {{1, 2}, {3, 4}};

        try {
            System.out.println("\nПопытка доступа к matrix[2][0]:");
            System.out.println(matrix[2][0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
        }

        try {
            System.out.println("\nПопытка доступа к matrix[1][2]:");
            System.out.println(matrix[1][2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
        }


        try {
            System.out.println("\nПопытка доступа к null массиву:");
            int[] nullArray = null;
            System.out.println(nullArray[0]);
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e);
        }
    }
}
