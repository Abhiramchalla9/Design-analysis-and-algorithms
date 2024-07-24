import java.util.Scanner;
public class FibonacciFunctionCalls {
    
    private static int totalFunctionCalls = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Enter positive number :");
        } else {
            System.out.println("Calculating the Fibonacci sequence up to " + n + " and the counting function calls are:");

            for (int i = 0; ; i++) {
                totalFunctionCalls = 0;  
                int fib = calculateFib(i);
                if (i > n) {
                    break;
                }
                System.out.println("Fibonacci number: " + fib + ", Function calls: " + totalFunctionCalls);
            }
        }
    }
    public static int calculateFib(int n) {
        totalFunctionCalls++;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFib(n - 1) + calculateFib(n - 2);
        }
    }
}
