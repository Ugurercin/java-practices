import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    reverse();
    }

    private static void reverse() {
        System.out.println("Please enter the array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            System.out.println("Please enter a value: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Initial array is");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
