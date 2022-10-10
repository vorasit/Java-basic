import java.util.Scanner;

public class Vehicle {
    protected String brand = "PinZaa";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}


class Car extends Vehicle{
    private String modelName = "Mustang";    // Car attribute
    public String  model = "Mustang11";

    // public static void myStaticMethod() {
    //     System.out.println("Static methods can be called without creating objects");
    //   }
    
    public static void main(String[] args) {
        //String  model = "Mustang11";
        Car myCar = new Car();

        //myStaticMethod(); // Call the static method

        Person pInput = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username : "); 
        String name = sc.nextLine();
        pInput.setName(name);
        System.out.println(pInput.getName());

        myCar.brand = pInput.getName();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName );
    }
}