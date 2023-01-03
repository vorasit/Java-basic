package test;

public class Main {
    static void myMethod(String fname) {
        System.out.println(fname + "Zaa");
    }

    static int myCalc(int a, int b) {
        return a + b;
    }

    // Method Overloading
    static int plusMethod(int a, int b) {
        return a + b;
    }

    // Method Overloading
    static double plusMethod(double a, double b) {
        return a + b;
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        myMethod("Pin");
        myMethod("Parn");
        System.out.println(myCalc(1, 2));

        // Method Overloading
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("Int : " + myNum1);
        System.out.println("Double : " + myNum2);

        int result = sum(10);
        System.out.println(result);

    }

}
