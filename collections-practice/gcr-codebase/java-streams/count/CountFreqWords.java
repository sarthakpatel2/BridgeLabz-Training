import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class CountFreqWords{
    public static void main(String[] args){
        String filePath="collections-practice/gcr-codebase/java-streams/source.txt";
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line =br.readLine()) != null) {
                //convert to lowercase and split into words
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word,wordCount.getOrDefault(word, 0) +1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        }
        // Sort words by frequency and get top 5
        List<Map.Entry<String, Integer>> topWords=wordCount.entrySet().stream().sorted((a, b) -> b.getValue()
            -a.getValue()).limit(5).collect(Collectors.toList());
        System.out.println("Top 5 most frequent words:");
        for (Map.Entry<String, Integer> entry :topWords) {
            System.out.println(entry.getKey()+" - " +entry.getValue());
        }
    }
}
