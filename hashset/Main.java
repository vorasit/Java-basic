package hashset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        // Check If an Item Exists
        System.out.println(cars.contains("Mazda"));

        for (String i : cars) {
            System.out.println(i);
        }
        // -----------------------------------------
        System.out.println("-------------------HashSet Iterator-----------------------");
        /*
         Java Iterator
            An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
            It is called an "iterator" because "iterating" is the technical term for looping.
         */

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        //System.out.println(it.next());
        // second item
        //System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // -----------------------------------------
        System.out.println("-------------------ArrayList Iterator-----------------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> itn = numbers.iterator();
        while(itn.hasNext()) {
        Integer i = itn.next();
        if(i < 10) {
            itn.remove();
        }
        }
        System.out.println(numbers);


    }
}
