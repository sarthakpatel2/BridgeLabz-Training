import java.util.*;
public class AnalyzeParagraph{
    //count words
    public static int countWords(String paragraph){
        if (paragraph==null|| paragraph.trim().isEmpty()){
            return 0;
        }
        return paragraph.trim().split("\\s+").length;
    }
    // find longest word
    public static String longestWord(String paragraph){
        if (paragraph==null ||paragraph.trim().isEmpty()){
            return "";
        }
        String words[]=paragraph.trim().split("\\s+");
        String longest="";
        for (String word:words) {
            String cleanWord = "";
            for (int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if ((ch >='A'&& ch<='Z') ||(ch>='a' &&ch<='z')){
                    cleanWord=cleanWord +ch;
                }
            }
            if (cleanWord.length() >longest.length()) {
                longest=cleanWord;
            }
        }
        return longest;
    }
    //replace word
    public static String replacedWord(String paragraph,String oldWord,String newWord){
        if (paragraph==null ||paragraph.trim().isEmpty()) {
            return "";
        }
       String[] words=paragraph.split(" ");
        String result= "";
        for (String w :words) {
            if (w.equalsIgnoreCase(oldWord)){
                result+= newWord +" ";
            }else{
                result+=w+" ";
            }
        }
        return result.trim();

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter paragraph:");
        String paragraph=sc.nextLine();
        if (paragraph.trim().isEmpty()){
            System.out.println("Empty paragraph");
            return;
        }
        System.out.println("Word Count: "+countWords(paragraph));
        System.out.println("Longest Word: "+longestWord(paragraph));
        System.out.println("Enter word to replace: ");
        String oldWord=sc.next();
        System.out.println("Enter new word: ");
        String newWord=sc.next();
        String updateParagraph =replacedWord(paragraph, oldWord, newWord);
        System.out.println("Updated Paragraph: ");
        System.out.println(updateParagraph);
        sc.close();
    }
}
