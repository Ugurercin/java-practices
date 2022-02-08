import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        printArray(sortArray(getIntegers(getArraySize())));
    }

    public static int getArraySize() {
        System.out.println("Please enter desired array size:");
        int arraySize = scanner.nextInt();
        return arraySize;
    }

    public static int[] getIntegers(int size) {
        System.out.println("Please enter values into array: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
