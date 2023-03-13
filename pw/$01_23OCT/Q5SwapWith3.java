
/*
 Q5 - Write a Java program to swap two numbers with the help of a third variable. 
 Sample Input : 2,3
 Sample Output : 3,2
 */
import java.util.Scanner;

public class Q5SwapWith3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;

		c = a;
		a = b;
		b = c;
		/*
		 * a = a+b;
		 * b = a-b;
		 * a = a-b;
		 */
		System.out.println(a + " " + b);
		sc.close();
	}
}
