
/*Q3 - Write a program to calculate the factorial of a number.     
Explanation:
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n.
E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
Also,
1! = 1
0! = 0
Input1:  5
Output1: 120
Input2:  1
Output2: 1*/
import java.util.Scanner;

public class Q3Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), ans = 1;
        if (num == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= num; i++) {
                ans *= i;
            }
            System.out.println(ans);

        }
    }
}
