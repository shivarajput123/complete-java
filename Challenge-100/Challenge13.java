// 13.Create a program to calculate Compound interest
//  Compound Interest = P(1 + R/100)t
import java.util.Scanner; 
public class Challenge13 {
    public static void main(String[] args) {
        System.out.println("please enter the value....");
        Scanner input = new Scanner (System.in);
        System.out.print("principal P:");
        int P = input.nextInt();
        System.out.print("rate R%:");
        int R = input.nextInt();
        System.out.print("time T year :");
        int T = input.nextInt();
        int Ci = P*(1+R/100)*T;
        System.out.println("compund interest:"+Ci);

    }
    
}
