package test.inner_and_outter_class;

// class OuterClass {
//     int x = 10;

//     class InnerClass {
//         int y = 5;
//     }
// }

class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {

        // OuterClass myOuter = new OuterClass();
        // OuterClass.InnerClass myInner = myOuter.new InnerClass();
        // System.out.println(myInner.y + myOuter.x);

        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);

    }
}
