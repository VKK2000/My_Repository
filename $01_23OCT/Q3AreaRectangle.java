/*Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.*/
import java.util.Scanner;

public class Q3AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		System.out.println(length*breadth);
		
		sc.close();
	}

}