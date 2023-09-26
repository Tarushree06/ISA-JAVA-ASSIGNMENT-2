// Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?

// Input Format
// The first line contains N , then N integers follow each denoting the number of the car.

// Constraints
// N<=1000 Car No >=0 && Car No <=1000000000

// Output Format
// N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !

// Sample Input
// 2
// 12345
// 12134
// Sample Output
// Yes
// No
// Explanation
// 1 + 3 + 5 = 9 which is divisible by 3
// 1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.


import java.util.Scanner;

public class OddAndEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int carNumber = scanner.nextInt();
            if (isAllowed(carNumber)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }

    public static boolean isAllowed(int carNumber) {
        int sumEven = 0;
        int sumOdd = 0;
        while (carNumber > 0) {
            int digit = carNumber % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            carNumber /= 10;
        }
        return sumEven % 4 == 0 || sumOdd % 3 == 0;
    }
}
