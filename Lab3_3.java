import java.util.Arrays;
import java.util.Scanner;

public class Lab3_3 {
    public static int[] removeElement(int[] array, int x) {
        return Arrays.stream(array)
                .filter(i -> i >= x)
                .toArray();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array_size = 0;

        System.out.print("Введите размерность массива: ");

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
                    System.out.print(elem + " ");
                }

                System.out.println();

                System.out.println("Введите целое число x: ");
                int x = array[0];

                array = removeElement(array, x);

                for(int i = 0; i < array_size - 1; i++) {
                    for (int j = i + 1; j< array.length; j++) {
                        if(array[i] > array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }

                System.out.println("Полученный массив: ");
                System.out.println(Arrays.toString(array));
            }
        }
        scanner.close();
    }
}