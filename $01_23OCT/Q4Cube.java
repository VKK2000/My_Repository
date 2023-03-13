/*
Q4 - Write a Java program to calculate the cube of a number. (Easy)
Sample Input : 4
Sample Output : 64
*/
import java.util.Scanner;

public class Q4Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		
		System.out.println(number*number*number);
		
		sc.close();

	}

}
