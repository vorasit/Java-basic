public class Main {
    //final int x = 5;
    int x;
     // Create a class constructor for the Main class
    public Main() {
        x = 5;  // Set the initial value for the class attribute x
    }

    // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }


    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        myStaticMethod();// Call the static method
        // myPublicMethod(); This would compile an error
        Main myFunP = new Main();
        myFunP.myPublicMethod(); // Call the public method on the object
        
    }
}
