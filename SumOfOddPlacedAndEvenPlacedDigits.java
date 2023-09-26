// Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.

// Input Format
// Constraints
// 0 < N <= 1000000000

// Output Format
// Sample Input
// 2635
// Sample Output
// 11
// 5
// Explanation
// 5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position.

// Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11

// Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5

import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlacedDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int oddSum = 0, evenSum = 0, flag = 1;
        while (N > 0) {
            if (flag % 2 == 0)
                evenSum += N % 10;
            else
                oddSum += N % 10;
            N /= 10;
            flag++;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
        scanner.close();
    }
}