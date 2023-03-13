package pwSkills.$04_29octConditionals;

/*Q4 - Write a program to print positive number entered by the user, if user enters a negative
number, it is skipped
sample Input :  Enter an integer: -6
Sample Output : The number is negative and skipped */
import java.util.Scanner;

public class Q4positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println("The number is positive");

        } else {
            System.out.println("The number is negative and skipped");
        }
    }

}
