import java.util.*;
public class FrequentCharacter{
    //method to find the most frequent character
    static char getFrequentChar(String text){
        // ASCII character frequency
        int[] frequency = new int[256];
        //count frequency of each character
        for (int i=0;i<text.length();i++){
            frequency[text.charAt(i)]++;
        }
        int maxCount = 0;
        char result = '\0';
        //identify character with highest frequency
        for (int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if (frequency[ch]>maxCount){
                maxCount=frequency[ch];
                result=ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String input=sc.nextLine();
        char Frequent=getFrequentChar(input);
        System.out.println("Most frequent character:- "+Frequent);
    }
}
