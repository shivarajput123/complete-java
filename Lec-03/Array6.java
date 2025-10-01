public class Array6 {
    public static void main(String[] args) {
        // int[] myarray = new int[5];
        // myarray[4] = 98;
        // myarray[1] = 8;
        // myarray[0] = 7;
        // myarray[3] = 18; 
        // myarray[2] = 2;
        int [] myArray = {98,2,8,65,37};
        // System.out.println(myArray[4]);
        // System.out.println(myArray[0]);
        // System.out.println(myArray[3]);
        // System.out.println(myArray[2]);
        // System.out.println(myArray[1]);
        // int index = 2;
        // System.out.println(myArray[index]);


        //array travaersal
        int index = 0;
        // while (index < 5){
        while (index < myArray.length){    
            System.out.println(myArray[index]);
            index++;
        }

        
        String[] myArr = new String[4];
        myArr [0] = "shiva";
        System.out.println(myArr[2]); 
        String[] strMyArr = {"shiva","chauhan","student"};
        System.out.println(strMyArr.length);


    }
}