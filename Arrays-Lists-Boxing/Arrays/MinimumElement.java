import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger() {
        System.out.println("Please enter the size of an array: ");
        int arraySize = scanner.nextInt();
        return arraySize;
    }

    private static int[] readElements(int size) {
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Please enter a value in to array: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    private static void printElements(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
