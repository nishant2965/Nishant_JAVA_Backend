
import java.util.*;

public class HashSetT {

    public static void forL(HashSet<String> hashset){
        int n = hashset.size();
        System.out.println("Using for loop");
        for(String i : hashset){
            System.out.println(i);
        }

    }

    public static void main(String [] args){
        HashSet<String> hashset = new HashSet<String>();
        hashset.add("Nishant");
        hashset.add("Agrawal");
        hashset.add("Trying");
        hashset.add("Hash");
        hashset.add("Set");
        hashset.add("in");
        hashset.add("java");
        hashset.add("and");
        hashset.add("he");
        hashset.add("is");
        hashset.add("doing");
        hashset.add("good");

        // forL(hashset);
        hashset.forEach(System.out::println);

        
    }

}
