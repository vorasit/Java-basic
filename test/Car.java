package test;

public class Car {
    // set default
    protected String title;
    protected String Model;
    protected String Color;
    protected int price;

    // constructor function
    public Car() {
        title = "Tesla";
        Model = "X";
        Color = "White";
        price = 1200000;
    }

    static void show() {
        Car myTesla = new Car();
        System.out.println("title : " + myTesla.title
                + " " + "Model :" + myTesla.Model
                + " " + "Color :" + myTesla.Color
                + " " + "Price :" + myTesla.price);
    }

    public static void main(String[] args) {
        show();
    }
}
