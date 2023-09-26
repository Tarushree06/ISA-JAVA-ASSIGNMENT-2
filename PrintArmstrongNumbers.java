// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

// Input Format
// Constraints
// 0 < N1 < 100 N1 < N2 < 10000

// Output Format
// Sample Input
// 400
// 1000
// Sample Output
// 407
// Explanation
// Each number in output is in separate line.

import java.util.Scanner;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        for (int i = N1; i <= N2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = 0;
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        for (; originalNum != 0; originalNum /= 10) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }

        return result == num;
    }
}