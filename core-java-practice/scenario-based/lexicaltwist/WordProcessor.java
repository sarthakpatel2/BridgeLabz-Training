package lexicaltwist;
import java.util.*;
public class WordProcessor{
    public static boolean isVowel(char ch){
        return "AEIOU".indexOf(ch)!=-1;
    }
    // first reverse then lowercase then replace vowels with @
    public static String transformReversedWord(String word){
        return new StringBuilder(word).reverse().toString().toLowerCase().replaceAll("[aeiou]", "@");
    }
    //process when words are not reverse
    public static void processCombinedWords(String word1, String word2) {
        String combined=(word1+word2).toUpperCase();
        int vowels=0,consonants=0;
        for (char ch:combined.toCharArray()){
            if (Character.isLetter(ch)){
                if (isVowel(ch))
                    vowels++;
                else
                    consonants++;
            }
        }
        if (vowels>consonants){
            printFirstTwoVowels(combined);
        }else if (consonants>vowels){
            printFirstTwoConsonant(combined);
        }else{
            System.out.println("Vowels and consonants are equal");
        }
    }
    private static void printFirstTwoVowels(String word){
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (char ch :word.toCharArray()) {
            if (isVowel(ch)){
                set.add(ch);
                if (set.size()==2) break;
            }
        }
        for (Character ch:set){
            System.out.print(ch);
        }
    }
    private static void printFirstTwoConsonant(String word){
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (char ch:word.toCharArray()){
            if (Character.isLetter(ch)&& !isVowel(ch)){
                set.add(ch);
                if (set.size()==2) break;
            }
        }
        for (Character ch:set){
            System.out.print(ch);
        }
    }
}
