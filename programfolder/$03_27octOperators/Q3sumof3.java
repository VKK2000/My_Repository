
/*Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
Input: 132
Output: 6 */
import java.util.Scanner;

public class Q3sumof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int sum = 0;
        for (int i = 3; i >= 1; i--) {
            int rem = digit % 10;
            digit = digit / 10;
            sum = sum + rem;
        }
        System.out.println(sum);
    }

}
