public class met_ja {
    static int plusMethodInt(int x,int y){
        return x + y;
    }
    static double plusMethodDouble(double x , double y){
        return x + y;
    }
    /* 
    static double plusMethodDouble(double x){
        return x ;
    }
    */
    
    public static void main(String[] args){
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        //double myNum3 = plusMethodDouble(4.3); // error
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
    
}
