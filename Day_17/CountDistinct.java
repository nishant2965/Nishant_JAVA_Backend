import java.util.HashMap;
import java.util.Map;

public class CountDistinct {
    public static void printCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }


        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "test string";
        printCharacterFrequency(str);
    }
}
