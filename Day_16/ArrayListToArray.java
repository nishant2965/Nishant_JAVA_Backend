// package Day_16;
import java.util.*;

public class ArrayListToArray {

    public static void main(String[] args){
        ArrayList <String> arraylist = new ArrayList<>();

        arraylist.add("nishant");
        arraylist.add("agrawal");
        arraylist.add("CIS");
        System.out.println(arraylist);

        String[] arr = new String[arraylist.size()];
        
        for(int i = 0; i<arraylist.size(); i++){
            arr[i] = arraylist.get(i);
            System.out.println(arr[i]);
        }

        
    }
    
}
