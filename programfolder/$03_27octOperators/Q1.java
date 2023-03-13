package $03_27octOperators;

/*Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
is taken with 5 and then multiply the resultant value by 5. Display the final result.
Input: 2345
Output: 20 */

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n += 8;
        n /= 3;
        n %= 5;
        n *= 5;
        System.err.println(n);
        sc.close();
    }

}