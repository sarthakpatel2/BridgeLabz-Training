public class LinearSearchWord{
    public static String searchWord(String[] sentences, String word){
        //linear search through each sentence
        for (String sentence :sentences){
            if (sentence.contains(word)){
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args){
        String[] sentences={
            "I am learning data structures",
            "Linear search is easy",
            "Practice makes a man perfect"
        };
        String word ="search";
        String result=searchWord(sentences, word);
        System.out.println(result);
    }
}
