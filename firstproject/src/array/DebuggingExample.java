
package array;

public class DebuggingExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b);  // Breakpoint here
        System.out.println("Sum: " + sum);
    }

    public static int add(int x, int y) {
        int result = x + y;  // Breakpoint here
        return result;
    }
}

m