
/*Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
and division.
sample Input :  Enter an operator (+, -, % /):  -
                Enter two numbers:  6
                                    8
sample Output:  6 - 8 = -2 */
import java.util.Scanner;

public class Q5calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator (+, -, % /): ");
        char sign = sc.next().charAt(0);
        int x = sc.nextInt();
        int y = sc.nextInt();

        switch (sign) {
            case '+':
                System.out.println(x + " " + sign + " " + y + " = " + (x + y));
                break;
            case '-':
                System.out.println(x + " " + sign + " " + y + " = " + (x - y));
                break;
            case '*':
                System.out.println(x + " " + sign + " " + y + " = " + (x + y));
                break;
            case '/':
                System.out.println(x + " " + sign + " " + y + " = " + (x + y));
                break;
            default:
                System.out.println("Enter valid option");
        }
    }

}
