/*
Q1 - Input name, roll number and field of interest from user and print in the format below :
Name: xyz, Roll number: xyz, Field of interest: xyz
Input : Single line format
Aman Gupta 4053 Physics
Output :
Name: Aman Gupta
Roll Number: 4053
Field of interest: Physics
*/

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int c = sc.nextInt();
		String d = sc.next();

		System.out.println("Name: " + a + " " + b);
		System.out.println("Roll_no: " + c);
		System.out.println("Field of interest: " + d);

		sc.close();
	}

}