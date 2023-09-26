// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

// Input Format
// Constraints
// 0 < N1 < 100 0 < N2 < 100

// Output Format
// Sample Input
// 10 
// 4
// Sample Output
// 5 
// 11 
// 14 
// 17 
// 23 
// 26 
// 29 
// 35 
// 38 
// 41
// Explanation
// The output will've N1 terms which are not divisible by N2.

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N1
        int N1 = scanner.nextInt();

        // Input N2
        int N2 = scanner.nextInt();

        // Initialize variables
        int count = 0;
        int n = 1;

        // Print N1 terms of the series
        while (count < N1) {
            int term = 3 * n + 2;
            if (term % N2 != 0) {
                System.out.println(term);
                count++;
            }
            n++;
        }

        scanner.close();
    }
}