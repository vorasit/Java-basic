public class plus {
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        double myNum3 = plusMethod(5.3, 10.26);
        double myNum4 = plusMethod(9.3);

        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println(myNum3);
        System.out.println(myNum4);
      }
      static int plusMethod(int x, int y) {
        return x + y;
      }
      static double plusMethod(double x) {
        return x ;
      }  
      static double plusMethod(double x, double y) {
        return x + y;
      }  

      
}
