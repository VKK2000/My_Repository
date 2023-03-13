package pwSkills.$04_29octConditionals;
/*Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and 
calculate Profit or Loss.
Explanation : Formula for profit and loss :Profit = SP- CP ,Loss =CP-SP
(S.P is Selling Price and C.P is Cost Price)

Sample Input :  Enter cost price: 4000
                Enter selling price: 9560
Sample Output:  Profit = 5560 */

import java.util.Scanner;

public class Q3profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();

        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.println("Profit = " + (sp - cp));
        } else {
            System.out.println("Loss = " + (cp - sp));
        }
    }

}
