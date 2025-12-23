import java.util.*;
public class Anagram{
    //method to check whether two texts are anagrams
    static boolean isAnagramText(String first,String second) {
        //remove spaces and convert to lowercase for fair comparison
        first=first.replaceAll("\\s+","").toLowerCase();
        second=second.replaceAll("\\s+","").toLowerCase();
        //check length condition
        if (first.length() !=second.length()) {
            return false;
        }
        int[]cnt1 = new int[256];
        int[]cnt2 = new int[256];
        //calculate frequency of characters for first text
        for (int i = 0; i < first.length(); i++) {
            cnt1[first.charAt(i)]++;
        }
        //calculate frequency of characters for second text
        for (int i = 0;i<second.length();i++) {
            cnt2[second.charAt(i)]++;
        }
        //compare frequencies
        for (int i = 0;i<256;i++) {
            if (cnt1[i] !=cnt2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first text ");
        String text1=sc.nextLine();
        System.out.print("Enter second text ");
        String text2 =sc.nextLine();
        boolean result= isAnagramText(text1, text2);
        if (result){
            System.out.println("The given texts are anagrams");
        } else {
            System.out.println("The given texts are not anagrams");
        }
    }
}
