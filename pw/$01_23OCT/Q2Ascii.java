
/*Q2 - Print the ASCII value of character ‘U’.*/
import java.util.Scanner;

class Q2Ascii {
    public static void main(String[] args) {
        System.out.println("enter an alphabate: ");
        Scanner sc = new Scanner(System.in);
        int alphabate = sc.next().charAt(0);

        System.out.println("The value of entered character is " + alphabate);
        sc.close();
    }
}