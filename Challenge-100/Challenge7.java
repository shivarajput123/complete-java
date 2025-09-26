// 7.Create a program to swap two numbers. 

import java.util.Scanner;
public class Challenge7{
    public static void main(String[] args) {
        System.out.println("please enter the  number:");
        Scanner input = new Scanner (System.in);
        System.out.print("firstValue:");
        int a = input.nextInt();
        System.out.print("secondValue:");
        int b = input.nextInt();
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("after swapping");
        System.out.println("firstValue:" + a );
        System.out.println("secondValue:" + b );


    }
}
