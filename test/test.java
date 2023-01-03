package test;

public class test {
    public static void main(String[] args) {
        // System.out.println("sawadeee");
        /*
         * String name = "pin";
         * System.out.println("hello " + name);
         * int x, y, z;
         * x = y = z = 50;
         * System.out.println(x + y + z);
         * float myFloatNum = 5.99f;
         * char myLetter = 'D';
         * boolean myBool = true;
         * 
         * double myDouble = 9.78d;
         * int myInt = (int) myDouble;
         * System.out.println(myDouble);
         * System.out.println(myInt);
         * 
         * String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         * System.out.println("The length of the txt string is: " + txt.length());
         * System.out.println(txt.toUpperCase());
         * System.out.println(txt.toLowerCase());
         * 
         * String firstName = "John";
         * String lastName = "Doe";
         * System.out.println(firstName + " " + lastName);
         * System.out.println(firstName.concat(lastName));
         * 
         * int randomNum;
         * for (int i = 0; i < 10; i++) {
         * randomNum = (int) (Math.random() * 10);
         * System.out.println(randomNum);
         * }
         */

        // int i = 0;
        // while (i < 5) {
        // System.out.println(i);
        // i++;
        // }

        // for (int i = 0; i <= 2; i++) {
        // System.out.println("outter: " + i);

        // // in loop
        // for (int j = 0; j <= 3; j++) {
        // System.out.println("inner: " + j);
        // }
        // }

        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // for (String i : cars) {
        // System.out.println(i);
        // }

        // for (int i = 0; i < 10; i++) {
        // if (i == 4) {
        // break;
        // }
        // System.out.println(i);
        // }

        // for (int i = 0; i < 10; i++) {
        // if (i == 4) {
        // continue;
        // }
        // System.out.println(i);
        // }

        int[][] myNumber = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        // System.out.println(myNumber[1][2]);
        for (int i = 0; i < myNumber.length; i++) {
            for (int j = 0; j < myNumber[i].length; j++) {
                System.out.println(myNumber[i][j]);
            }
        }

    }
}
