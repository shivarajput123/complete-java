import java.util.Scanner;
class Return {
    
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to calculator..");
        // System.out.print("please enter the first number:");
        // int first = input.nextInt();
        // System.out.print("please enter the second number:");
        // int second = input.nextInt();
        // int sum = first + second;
        // System.out.println("sum of two number:" + sum);
    
        int first = readNumber();
        int second = readNumber();
        int sum = first + second;
        System.out.println("sum of two number:" + sum);
    }
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number:");
        int number = input.nextInt();
        return number;


    }
    public static void greet(){
        System.out.println("welcome to calculator..");
    }
    


}
