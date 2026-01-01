import java.util.*;
public class SentenceFormatter{
    //method to format paragraph
    public static String format(String paragraph){
        //edge case:- null or empty after trimming
        if (paragraph ==null||paragraph.trim().isEmpty()){
            return "";
        }
        //trim and reduce multiple spaces to single space
        paragraph=paragraph.trim().replaceAll("\\s+"," ");
        StringBuilder result=new StringBuilder();
        boolean capitalNext=true;
        for (int i=0;i<paragraph.length();i++) {
            char ch=paragraph.charAt(i);
            if(capitalNext &&Character.isLetter(ch)){
                result.append(Character.toUpperCase(ch));
                capitalNext = false;
            }else{
                result.append(ch);
            }
            //make capital
            if (ch=='.'|| ch=='?'||ch=='!'){
                capitalNext=true;
                //ensure exactly one space after punctuation
                if (i+1<paragraph.length() &&paragraph.charAt(i+1)!=' '){
                    result.append(' ');
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input =sc.nextLine();
        System.out.println(format(input));
    }
}
