//14.Create a program to convert Fahrenheit to Celsiu
//  °C = (°F - 32) × 5/9

import java.util.Scanner;
public class Challenge14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("please enter the fahrenheit value:");
        float F = input.nextFloat();
        float Celcius = (F-32)*5/9;
        System.out.print("celcius:"+ Celcius);
    }
    
}
