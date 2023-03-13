
/*Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :
Sample Input :  Enter Your Marks: 98
Sample Output : Your Grade is A+ */
import java.util.Scanner;

public class Q6grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if ((marks <= 100) && (marks > 90)) {
            System.out.println("Your Grade is A+");
        } else if ((marks <= 90) && (marks > 80)) {
            System.out.println("Your Grade is A");
        } else if ((marks <= 80) && (marks > 70)) {
            System.out.println("Your Grade is B+");
        } else if ((marks <= 70) && (marks > 60)) {
            System.out.println("Your Grade is B");
        } else if ((marks <= 60) && (marks > 50)) {
            System.out.println("Your Grade is C");
        } else if ((marks <= 50) && (marks > 40)) {
            System.out.println("Your Grade is D");
        } else if ((marks <= 40) && (marks > 30)) {
            System.out.println("Your Grade is E");
        } else if ((marks <= 30) && (marks > 0)) {
            System.out.println("Your Grade is F");
        }
    }
}
