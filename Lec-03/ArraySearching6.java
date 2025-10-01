import java.util.Scanner;
public class ArraySearching6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,6,88,87,65,4,68,23,9,98,34};
        System.out.println("welcome to array searching" );
        System.out.println("please enter the number");
        int num = input.nextInt();
        boolean isFoundNumber = isFound(arr,num);
        if (isFoundNumber){
            System.out.println("your number was found in array");
            
        }else{
            System.out.println("your array was not found in array");


        }  

    }
    public static boolean isFound(int[] arr,int num){
        int index = 0;
        while (index < arr.length){
            if(arr[index]==num){
                return true;
                
            }
            index++;
        }
        
        return false;
        


    }
    
}


    
