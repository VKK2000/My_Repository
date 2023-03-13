
/*Q5 - Given few lines of input(number of lines unknown) where each line has two
strings, concatenate the strings.
Input : Hello World
        Happy Faces
        Sunny Day
        Good Morning
Output :HelloWorld
        HappyFaces
        SunnyDay
        GoodMorning */
import java.util.Scanner;

class Q5concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) { // in place of for we can put while(sc.hasNextLine())
            String a = sc.next();
            String b = sc.next();
            System.out.println("" + a + b);

        }
    }

}