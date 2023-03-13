
/*Q2 - swap two numbers without the use of third variable.
Input: 5 10
output:10 5 */
import java.util.Scanner;

public class Q2swap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.err.println(a + " " + b);
        System.err.println(b);
    }
}
