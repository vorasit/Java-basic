package Link_List;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.addFirst("Pinzaa");
        cars.addLast("Labo");

        System.out.println(cars.get(0));

        for(String i : cars){
            System.out.println(i);
        }
        /*
        How the LinkedList works
        The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. 
        To add an element to the list, 
        the element is placed into a new container and that container is linked to one of the other containers in the list.
        -------------------------------------------------------------------------------
         Method             	Description	
        addFirst()	     Adds an item to the beginning of the list.	
        addLast()	     Add an item to the end of the list	
        removeFirst()	Remove an item from the beginning of the list.	
        removeLast()	Remove an item from the end of the list	
        getFirst()	    Get the item at the beginning of the list	
        getLast()	    Get the item at the end of the list
         */

    }

}
