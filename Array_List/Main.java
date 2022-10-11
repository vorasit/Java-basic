package Array_List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // create array 
        ArrayList<String> cars = new ArrayList<String>();
        
        // add
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //ArrayList Size
        System.out.println(cars.size());

        // Access an Item
        System.out.println(cars.get(0));

        // Change an Item
        cars.set(0, "Opel");
        System.out.println(cars.get(0));

        cars.remove(0);
        System.out.println(cars.get(0));

        cars.clear();
        System.out.println(cars);

        // --------------------------------------------------
        System.out.println("---------------------------------------------");
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for(int i : myNumbers){
            System.out.println(i);
        }
    }
}
