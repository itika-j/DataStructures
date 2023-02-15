package Hashing;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Hashset
 */
public class Hashset {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        //Insert - set.add(el)

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //printAll
        System.out.println(set);

        //Search - set.contains(el)

        if(set.contains(1)){
            System.out.println("Element is present");
        }
        if(!set.contains(6)){
            System.out.println("Elemnt not present");
        }

        //delete - set.remove(el)

        set.remove(1);

        //size
        System.out.println("Size of set is " + set.size());

        //iterator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}