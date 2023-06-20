import java.util.*;

public class Traversal_ArrayList {
    

    public static void createArrayList(ArrayList<String> str){
        str.add("nishant");
        str.add("trying");
        str.add("traversal");
    }

    public static void usingFor(ArrayList<String> str){
        System.out.println("usingFor");

        for(int i = 0; i<str.size(); i++){
            System.out.println(str.get(i));
        }
        System.out.println("///////////////////////////");

    }

    public static void usingEnhancedFor(ArrayList<String> str){
        System.out.println("usingEnhancedFor");

        for(String s : str){
            System.out.println(s);
        }
        System.out.println("///////////////////////////");
        
    }

    public static void usingIterator(ArrayList<String> str){
        System.out.println("usingIterator");

        Iterator<String> itr = str.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("///////////////////////////");
        
    }

    public static void usingForEach(ArrayList<String> str){
        System.out.println("usingForEach");


        str.forEach(element -> {
            System.out.println(element);
        });
        System.out.println("///////////////////////////");
        
    }

    public static void usingParallelStream(ArrayList<String> str){
        System.out.println("usingParallelStream");

        str.parallelStream().forEach(item ->{
            System.out.println(item);
        });
        System.out.println("///////////////////////////");
        
    }


    public static void removeLast(ArrayList<String> str){


        System.out.println("Removing last element from the arrayList");
        str.remove(str.size() - 1);
        System.out.println(str);
    }



    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<String>();
        createArrayList(str);

        // System.out.println(str);
        usingFor(str);
        usingEnhancedFor(str);
        usingIterator(str);
        usingForEach(str);
        usingParallelStream(str);
        removeLast(str);
    }
    
}
