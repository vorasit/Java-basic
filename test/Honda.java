package test;

import java.io.PipedInputStream;
import java.util.Scanner;

class Honda extends Car {
    // Model="Civi";Color="Black";price=800000;
    final int HondaNumber = 12345;

    public void study() {
        System.out.println("Studying all day long");
    }

    public Honda() {
        title = "Hoda";
        Model = "Civi";
        Color = "Black";
        price = 800000;
    }

    public static void show() {
        Honda h = new Honda();
        System.out.println("title : " + h.title
                + " " + "Model :" + h.Model
                + " " + "Color :" + h.Color
                + " " + "Price :" + h.price
                + " " + "HondaNumber :" + h.HondaNumber);
    }

    public static void main(String[] args) {
        show();

        // Scanner myObj = new Scanner(System.in);
        // System.out.println("Enter username");
        // String user = myObj.nextLine();
        // System.out.println("user : " + user);
    }
}
