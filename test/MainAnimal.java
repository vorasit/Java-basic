package test;

// Polymorphism
public class MainAnimal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public static void main(String[] args) {
        MainAnimal myAnimal = new MainAnimal(); // Create a Animal object
        Pig myPig = new Pig(); // Create a Pig object
        Dog myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

class Pig extends MainAnimal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends MainAnimal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
