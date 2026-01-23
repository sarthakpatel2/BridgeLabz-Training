import java.util.*;
public class WordFrequency{
    public static void main(String[] args) {
        String text ="Hello world, I'm Batman!";
        Map<String, Integer> freqMap= new HashMap<>();
        text =text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) +1);
        }
        System.out.println(freqMap);
    }
}
