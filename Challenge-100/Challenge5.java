//  5.Create a program to input name of the person and 
// respond with ”Welcome NAME to shiva ”


import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
         System.err.println("please enter your name :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

     
        System.out.println("welcome " + name + " coding");
    }
}
