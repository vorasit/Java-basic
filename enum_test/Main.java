package enum_test;

public class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
    
        switch(myVar) {
          case LOW:
            System.out.println("Low level");
            break;
          case MEDIUM:
             System.out.println("Medium level");
            break;
          case HIGH:
            System.out.println("High level");
            break;
        }
        // ----------------------------------------
        System.out.println("------Loop Through an Enum-----");
        for (Level myVar1 : Level.values()) {
            System.out.println(myVar1);
          }
      }
}
