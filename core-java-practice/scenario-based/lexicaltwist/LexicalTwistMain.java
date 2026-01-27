package lexicaltwist;
import java.util.*;
public class LexicalTwistMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1=sc.nextLine();
        System.out.println("Enter the second word");
        String word2=sc.nextLine();
        //validation
        if (!WordValidator.isValidWord(word1)) {
            System.out.println(word1+" is an invalid word");
            return;
        }
        if (!WordValidator.isValidWord(word2)){
            System.out.println(word2+" is an invalid word");
            return;
        }
        // Check reverse condition
        if (WordValidator.isReverse(word1, word2)) {
            String result=WordProcessor.transformReversedWord(word1);
            System.out.println(result);
        }else{
            WordProcessor.processCombinedWords(word1, word2);
        }
    }
}
