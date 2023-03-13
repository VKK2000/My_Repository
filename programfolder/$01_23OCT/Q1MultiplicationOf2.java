/*Q1 - Take 2 integer values in two variables x and y and print their product.*/
import java.util.Scanner;
class MultiplicationOf2{
    public static void  main (String [] args){
    System.out.println("Enter teo numbers: ");
    Scanner sc= new Scanner (System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    System.out.println("The multiplication of "+a+" and "+b+" is "+a*b);
    }
}