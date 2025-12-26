import java.util.*;
public class LongestWord{
    // method to find the longest word in a sentence
    static String getLongestWord(String sentence){
        String longest ="";
        String current ="";
        //traverse character by character
        for (int i =0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            //build word until a space is found
            if (ch !=' ') {
                current+=ch;
            } else{
                //compare lengths when a word ends
                if (current.length()>longest.length()){
                    longest=current;
                }
                current ="";
            }
        }
        //final comparison for last word
        if (current.length()>longest.length()){
            longest=current;
        }
        return longest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence:- ");
        String input = sc.nextLine();
        String result = getLongestWord(input);
        System.out.println("Longest word is:- "+result);
    }
}
