// Given a integer as a input and replace all the '0' with '5' in the integer

// Input Format
// Enter an integer n

// Constraints
// 0<=n<=1000000000000

// Output Format
// All zeroes are replaced with 5

// Sample Input
// 102
// Sample Output
// 152
// Explanation
// Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.

import java.util.*;

public class ReplaceThemAll {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long replacedNumber = replacezerowithfive(n);
        System.out.println(replacedNumber);
        scanner.close();
    }

    public static long replacezerowithfive(long n) {
        String numberStr = String.valueOf(n);
        String replacedStr = numberStr.replace('0', '5');
        long replacedNumber = Long.parseLong(replacedStr);
        return replacedNumber;
    }
}