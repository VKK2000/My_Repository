
/*Q4- Write a program to print all Armstrong numbers between 1 to n. (Medium)
Explanation:
A three digit number is called the Armstrong number if the sum of the cube of its digit is equal to the number itself.
E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.
Input1: 1000
Output1:0
        1
        153
        370
        371
        407
Input2: 500
Output2:0
        153
        370
        1
        371
        407 */
import java.util.Scanner;

public class Q4Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        while (num <= n) {
            int count = 0;
            int i = num;

            while (i > 0) {
                count++; // digit count of current number
                i /= 10;
            }

            int val = num; // temp variable for current value
            int sum = 0;

            while (val > 0) {
                int digit = val % 10;
                sum += Math.pow(digit, count);// code for calculate cube sum
                val /= 10;
                if (sum > val) {
                    continue;// if cube sum is greater next interation
                }
            }

            if (sum == num) {// compare current value
                System.out.print(num + " ");
            }

            num++;// if not equal increment current number
        }
    }
}