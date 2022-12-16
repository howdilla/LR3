import java.util.Arrays;
import java.util.Scanner;

public class Lab3_2 {
    public static int[] removeElement(int[] array, int x) {
        return Arrays.stream(array)
                .filter(i -> i != x)
                .toArray();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array_size = 0;

        System.out.println("Введите размерность массива: ");

        if (scanner.hasNextInt()) {
            array_size = scanner.nextInt();

            if ( array_size<=0) {
                System.out.println("Размерность массива не может быть отрицательной и равной нулю.");
                scanner.close();

            } else {
                int array[] = new int [array_size];

                System.out.println("Введите элементы массива: ");

                for (int i = 0; i < array_size; i++) {
                    array[i] = scanner.nextInt();
                }

                System.out.println("Исходный массив: ");

                for (int elem : array) {
                    System.out.print(elem + "");
                }

                System.out.println();

                System.out.println("Введите целое число x: ");
                int x = scanner.nextInt();

                array = removeElement(array, x);

                System.out.println("Полученный массив: ");
                System.out.println(Arrays.toString(array));
            }
        }
        scanner.close();
    }
}