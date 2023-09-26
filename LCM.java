// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which returns the LCM of N1 and N2. Print the value returned.

// Input Format
// Constraints
// 0 < N1 < 1000000000
// 0 < N2 < 1000000000

// Output Format
// Sample Input
// 4 
// 6
// Sample Output
// 12
// Explanation
// The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int gcd = 1;
        for (int i = 1; i <= N1 && i <= N2; ++i) {
            if (N1 % i == 0 && N2 % i == 0)
                gcd = i;
        }
        int lcm = (N1 * N2) / gcd;
        System.out.println(lcm);
        scanner.close();
    }
}
