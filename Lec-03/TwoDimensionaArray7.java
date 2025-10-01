public class TwoDimensionaArray7 {
    public static void main(String[] args) {
        // int[][] myArray = new int[2][3];
        // myArray[0][0] = 6;
        // myArray[1][2] = 9;
        int[][] myArr = {{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(myArr[0][2]);
        //System.out.println(myArr.length);
        
        int i = 0;
        while(i < myArr.length){
            int j = 0;
            while (j < myArr[i].length ){
                System.out.print(myArr[i][j] + " ");
                j++;

            }
            System.out.println();
            i++;
        }
    }
    
}
