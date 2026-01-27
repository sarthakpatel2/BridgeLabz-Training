package lexicaltwist;
public class WordValidator{
    // hto check if input is a single word
    public static boolean isValidWord(String word){
        return !word.contains(" ");
    }
    //check if second word is reverse of first
    public static boolean isReverse(String word1, String word2){
        String reversed=new StringBuilder(word1).reverse().toString();
        return reversed.equalsIgnoreCase(word2);
    }
}
