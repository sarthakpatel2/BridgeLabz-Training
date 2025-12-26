import java.util.*;
public class VowelConsonantCount{
    // method to count vowels and consonants
    static void count(String text){
        int vowel= 0;
        int consonant= 0;
        text=text.toLowerCase();
        for (int i= 0;i<text.length();i++) {
            char ch= text.charAt(i);
            //check only alphabet characters
            if (ch >='a'&&ch<='z') {
                if (ch=='a'|| ch=='e'||ch =='i'||ch=='o'|| ch=='u'){
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("Vowels "+vowel);
        System.out.println("Consonants "+consonant);
    }
    public static void main(String[] args) {
        Scanner text= new Scanner(System.in);
        System.out.print("Enter a string ");
        String input= text.nextLine();
        count(input);
    }
}
