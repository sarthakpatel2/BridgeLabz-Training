import java.util.*;
class VovelAndConsonent{
    //method to check a character
    static String checkCharacter(char ch) {
        //convert uppercase to lowercase 
        if (ch>='A' &&ch <='Z') {
            ch=(char)(ch+ 32);
        }
        //check if character is a letter
        if (ch>='a'&&ch<='z') {
            //check for vowels
            if (ch =='a'|| ch =='e'|| ch =='i' ||ch =='o' ||ch=='u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        //character is not an alphabet
        return"Not a Letter";
    }
    //method to count vowels and consonants using charAt()
    static int[] countVowelsConsonants(String text){
        int vCount=0;
        int cCount=0;
        for (int i=0;i<text.length();i++) {
            String result=checkCharacter(text.charAt(i));
            if (result.equals("Vowel")) {
                vCount++;
            } else if (result.equals("Consonant")) {
                cCount++;
            }
        }
        //return counts in array
        return new int[]{vCount,cCount};
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //take input from user
        System.out.print("Enter a string ");
        String input =sc.nextLine();
        //call user-defined method
        int[] result= countVowelsConsonants(input);
        //display result
        System.out.println("\nNumber of Vowels     : " + result[0]);
        System.out.println("Number of Consonants : " + result[1]);
    }
}
