package hash_map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String>  capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        // capitalCities.remove("England");
        // capitalCities.clear();
        System.out.println(capitalCities.size());

        for(String i :capitalCities.values()){
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // ---------------------------------------------------------
        System.out.println("-----------------------------------------");
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for(String i : people.keySet()){
            System.out.println("key: "+i+" value: "+people.get(i));
        }

    }
}
