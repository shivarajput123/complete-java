import java.util.Scanner;
public class Challenge22{
    public static void main(String[] args) {
        System.out.println("showing bitwise and operator \n");
        Scanner input = new Scanner (System.in);
        System.out.print("enter the first number :");
        int first = input.nextInt();
        System.out.print("enter thw second number:");
        int second = input.nextInt();
        int result = first | second;
        System.out.print("result is:" + result);

    } 

    
}

