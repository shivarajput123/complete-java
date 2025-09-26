import java.util.Scanner;
public class Challenge6 {
    public static void main(String[] args) {
        System.out.println("please enter the first number:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("please enter the second number :");
        int num2 = input.nextInt();
        int add = num1 + num2;
        System.out.println("add two number:" +add);
    }
    
}
