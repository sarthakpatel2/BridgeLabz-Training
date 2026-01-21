import java.util.*;
public class FrequencyOfElements{
    public static void main(String[] args){
        // Input list
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        // Map to store frequency
        Map<String, Integer> frequencyMap =new HashMap<>();
        // Counting frequency
        for (String item : list) {
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) +1);
            } else {
                frequencyMap.put(item,1);
            }
        }
        System.out.println(frequencyMap);
    }
}
