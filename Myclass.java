import java.util.Scanner;
public class Myclass {
    public static void main(String[] args) {
        /*
        Person myObj = new Person();
        myObj.setName("pin");
        System.out.println(myObj.getName());
        */
        Person myObjPerson = new Person();
        try (Scanner myInput = new Scanner(System.in)) {
            String name;

            // Enter username and press Enter
            System.out.println("Enter username"); 
            name = myInput.nextLine();
            myObjPerson.setName(name);
        }
        System.out.println("name is : "+myObjPerson.getName());

    }
}
