package starpattern;

import java.util.Scanner;

public class invertedpyramid {

    public void printReversePyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close(); // Close scanner

        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedpyramid obj = new invertedpyramid();
        obj.printReversePyramid();
    }
}
