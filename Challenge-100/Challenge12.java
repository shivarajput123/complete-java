// 12.Create a program to calculate simple interest.
//  Simple Interest = (P x T x R)/100 
import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        System.out.println("please enter the value....");
        Scanner input = new Scanner (System.in);
        System.out.print("enter principal P:");
        int P = input.nextInt();

        System.out.println("enter rate R:");
        int R = input.nextInt();

        System.out.println("enter time T:");
        int T = input.nextInt();

        int SI = (P * T * R)/100;
        System.out.println("simple interest :" + SI);

        
    }
    
}
