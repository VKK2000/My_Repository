
/*Q2 - Write a program to print absolute value of a number entered by the user.
sample Input : -1
sample Output : 1 */
import java.util.Scanner;

public class Q2absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(" " + number * (-1));

        } else {
            System.out.println("" + number);

        }
    }

}
