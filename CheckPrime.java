// Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

// Input Format
// Constraints
// 2 < N <= 1000000000

// Output Format
// Sample Input
// 3
// Sample Output
// Prime
// Explanation
// The output is case specific

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
            scanner.close();
    }
}