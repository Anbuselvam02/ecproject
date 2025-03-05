package starpattern;
import java.util.Scanner;

class DiamondPattern {
    
    // Method to print the diamond pattern
    public void printDiamond(int n) {
        // Upper Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" "); // Printing spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Printing stars
            }
            System.out.println();
        }

        // Lower Inverted Pyramid
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" "); // Printing spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Printing stars
            }
            System.out.println();
        }
    }
}

public class diamondpatternMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Create an object of DiamondPattern class
        DiamondPattern obj = new DiamondPattern();
        
        // Call the method using the object
        obj.printDiamond(rows);
    }
}
