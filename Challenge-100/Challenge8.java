// 8.Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%)
import java.util.Scanner;
public class Challenge8 {
    public static void main(String[] args) {
        System.out.println("please enter two number...");
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number:");
        int a = input.nextInt();
        System.out.print("enter second number:");
        int b = input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        
    }
    
}
