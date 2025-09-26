//  10.Create a program to calculate Perimeter of a rectangle. 
// Perimeter of rectangle ABCD = A+B+C+D.
import java.util.Scanner;
public class Challenge10{
    public static void main(String[] args) {
        System.out.println("please enter the side of rectangle...");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the horizantale side:");
        float a = input.nextFloat();
        float c = a;
        System.out.print("please enter the vertical side:");
        float b = input.nextInt();
        float d = b;
        float periMeterOfRactangle = a + b + c + d;
        System.out.println(periMeterOfRactangle);
    }
    
}
