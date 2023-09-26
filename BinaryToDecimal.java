// Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

// Input Format
// Constraints
// 0 < N <= 1000000000

// Output Format
// Sample Input
// 101010
// Sample Output
// 42
// Explanation
// For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long decimal = 0;
        long base = 1;
        while (N > 0) {
            long lastDigit = N % 10;
            N = N / 10;
            decimal += lastDigit * base;
            base = base * 2;
        }
        System.out.println(decimal);
        scanner.close();
    }
}
