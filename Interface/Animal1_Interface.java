package Interface;
// Interface
interface Animal1_Interface {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
class Pig implements Animal1_Interface{
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
      }
      public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
      }
}
// -------------------------------------------------------
// Multiple Interfaces
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}
class DemoClass implements FirstInterface,SecondInterface{
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}