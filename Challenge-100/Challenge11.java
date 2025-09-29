//  11.Create a program to calculate the Area of a Triangle. 
// Area of triangle = 1/2*B*H
import java.util.Scanner;
public class Challenge11 {
    public static void main(String[] args) {
        System.out.println("please enter the side....");
        Scanner sc = new Scanner (System.in);
        System.out.print("enter base of tringle:");
        double base = sc.nextFloat();
        System.out.print("enter hight of tringle:");
        double hight = sc.nextFloat();
        double area = (base*hight)/2;
        System.out.println("areaOfTringle:" + area);

    }
    
    
}
