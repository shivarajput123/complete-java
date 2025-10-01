 class Function3 {
    public static void main(String[] args) {
        // System.out.println("In main method ");
        // greetUser();
        // System.out.println("method callinng complete");
        firstPattern();
        //secondPattern();
        //thirdPattern();
    }
    public static void greetUser(){
        System.out.println("good morning");
    }
    public static void firstPattern(){
        //  System.out.println("*");
        //  System.out.println("* *");
        //  System.out.println("* * *");
        //  System.out.println("* * * *");
        //  System.out.println("* * * * *");
        int rows = 0;
        while(rows < 5){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
    public static void secondPattern(){
         System.out.println("\n* * * * *");
         System.out.println("* * * *");
         System.out.println("* * *");
         System.out.println("* * ");
         System.out.println("* ");

    }
    public static void thirdPattern(){
         System.out.println("        *");
         System.out.println("      * *");
         System.out.println("    * * *");
         System.out.println("  * * * *");
         System.out.println("* * * * *");
    }
    
}
