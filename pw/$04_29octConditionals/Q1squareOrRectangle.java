
/*Q1 - Write a program which takes the values of length and breadth from user and check if it is 
a square or not. ;
sample Input :  Enter length: 5
                Enter breadth:  4
sample Output : It is a rectangle */
import java.util.Scanner;

public class Q1squareOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.print("Enter breadth: ");
        int bre = sc.nextInt();

        if (len == bre) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is a rectangle");
        }
    }

}
