// Abstract class
public abstract class Animal {
    // public void animalSound() {
    //     System.out.println("The animal makes a sound");
    //   }

    // Abstract method (does not have a body)
    public abstract void animalSound();
}

class Pig extends Animal{
    // The body of animalSound() is provided here
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    // The body of animalSound() is provided here
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
}
  
