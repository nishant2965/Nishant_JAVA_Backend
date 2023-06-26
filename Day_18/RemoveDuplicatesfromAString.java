
import java.util.*;

public class RemoveDuplicatesfromAString {

    public static void main(String[] args){
        String s = "abcdacdb";
        HashSet<Character> h = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        char[] arr = new char[s.length()];

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            h.add(c);
        }
        for(char c : h){
            sb.append(c);
        }

        s = sb.toString();
        System.out.println(s);

        


    }
    
}
