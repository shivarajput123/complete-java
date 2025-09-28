import java.util.Scanner;
public class Relational7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("welcom to driving license portal");
        System.out.print("please enter  the age:");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("you are eligible to drive");

        }else{
            System.out.println("beta abhi cycle chlao");
        }
    }
    
}
