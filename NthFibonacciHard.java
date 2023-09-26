// Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

// Input Format
// Constraints
// 0 <= N <= 1000

// Output Format
// Sample Input
// 10
// Sample Output
// 55
// Explanation
// The 0th fibonnaci is 0 and 1st fibonnaci is 1.

import java.util.Scanner;

public class NthFibonacciHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] fib = new long[N + 2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(fib[N]);
        scanner.close();
    }
}
