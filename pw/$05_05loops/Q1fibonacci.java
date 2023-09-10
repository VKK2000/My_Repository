import java.util.Scanner;

/*Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
Input1: 6
Output1:1 1 2 3 5 8
Input2: 2
Output2:1 1 */
public class Q1fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");

        }
        sc.close();
    }

}
