import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class WordFrequency{
    public static void main(String[] args){
        String paragraph="Kohli goes down the ground";
        Map<String, Integer> wordCount=
            Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                  .collect(Collectors.toMap(
                      word->word, // key
                      word->1, // initial value
                      Integer::sum // merge duplicates
                  ));
        System.out.println(wordCount);
    }
}
