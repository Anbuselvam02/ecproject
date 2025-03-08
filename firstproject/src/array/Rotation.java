package array;
import java.util.*;



import java.util.Random;

public class Rotation {
    void leftRotate(int arr[], int d, int n) {
        int temp[] = new int[d];

        for (int i = 0; i < d; i++)
            temp[i] = arr[i];

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        
        
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Rotation rotate = new Rotation();
        Random rand = new Random();

        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Original Array:");
        rotate.printArray(arr, arr.length);

        rotate.leftRotate(arr, 3, arr.length);

        System.out.println("Array after left rotation:");
        rotate.printArray(arr, arr.length);
    }
}
