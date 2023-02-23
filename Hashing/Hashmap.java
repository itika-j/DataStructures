package Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> population = new HashMap<>();

        //Insertion
        population.put("India", 180);
        population.put("China", 210);
        population.put("America", 52);

        //print
        System.out.println(population);

        //containsKey
        System.out.println(population.containsKey("China"));
        System.out.println(population.containsKey("Europe"));

        //get value at key
        System.out.println(population.get("China"));
        System.out.println(population.get("Europe")); //Returns null if key doesnt exist

        //iterate
        for(Map.Entry<String,Integer> e: population.entrySet()){
            System.out.println(e.getKey());
        }

        Set<String> keys = population.keySet();
        for(String key : keys){
            System.out.println(key+ " " + population.get(key));
        }
    }
}
