// Take the following as input.

// Minimum Fahrenheit value
// Maximum Fahrenheit value
// Step

// Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
// 0 -17
// 20 -6
// 40 4
// 60 15
// 80 26
// 100 37

// Input Format
// The first line of the input contains an integer denoting the Minimum Fahrenheit value. The second line of the input contains an integer denoting the Maximum Fahrenheit value. The third line of the input contains an integer denoting the Step.

// Constraints
// 0 < Min < 100
// Min < Max < 500
// 0 < Step<150

// Output Format
// Print Fahrenheit and Celsius values separated by a tab. Each step should be printed in a new line.

// Sample Input
// 0 
// 100 
// 20
// Sample Output
// 0 -17 
// 20 -6 
// 40 4 
// 60 15 
// 80 26 
// 100 37
// Explanation
// First number in every output line is fahrenheit, second number is celsius. The two numbers are separated by a tab.

import java.util.Scanner;

public class ConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minF = scanner.nextInt();
        int maxF = scanner.nextInt();
        int step = scanner.nextInt();
        for (int i = minF; i <= maxF; i += step) {
            int celsius = (int) ((5.0 / 9) * (i - 32));
            System.out.println(i + "\t" + celsius);
            scanner.close();
        }
    }
}
