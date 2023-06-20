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
        

        System.out.println("trying array list to asrrya");

        String[] arr1 = new String[arraylist.size()];

        arr1 = arraylist.toArray(arr1);

        for(int i = 0; i<arraylist.size(); i++){
            System.out.println(arr1[i]);
        }
        
    }
    
}
