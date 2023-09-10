
/*Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
negative or zero. Calculate the sum of numbers until a negative number is encountered.
If the input is a negative number, current sum is discarded and print -1.
Input1:
        48
        2
        0
        6
        -5
        9
        7
Output1:
        -1
Input2:
        0
        2
        6
        1
        4
        0
Output2:
        13
 * 
*/
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean n = sc.hasNextInt();
        //
        // while (true) {
        // int a = sc.nextInt();
        //
        // if (a >= 0)
        // sum += a;
        // else {
        // sum = -1;
        // break;
        // }
        // System.out.println(sum);

        while (n) {
            int num = sc.nextInt();
            if (num >= 0) {
                sum += num;
            } else {
                sum = -1;
                break;
            }
        }
        System.out.print(sum);
    }

}
