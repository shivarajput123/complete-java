public class parameter5 {
    public static void main(String[] args) {
        int result = sumTwoNumber(4,6);
        System.out.println(result);
        System.out.println(sumTwoNumber(4,5));
        System.out.println(sumTwoNumber(5,6));
        System.out.println(sumTwoNumber(-8,8));
        


        
    }
    public static int sumTwoNumber(int firstNum ,int secondNum){
        System.out.println("first recived:" + firstNum);
        System.out.println("second recived:" + secondNum);
        int sum = firstNum + secondNum;
        return sum;
    }
    
}
