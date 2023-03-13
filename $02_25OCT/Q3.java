
/*Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
100), write a program to calculate his total marks and percentage marks.
Input : 78
        89
        95
Output :Total marks: 262
Percentage marks: 87%*/
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSub = sc.nextInt();
        int secondSub = sc.nextInt();
        int thirdSub = sc.nextInt();

        System.out.println("Total marks: " + (firstSub + secondSub + thirdSub));
        System.out.println("Percentage marks: " + ((firstSub + secondSub + thirdSub) / 3) + "%");
    }
}