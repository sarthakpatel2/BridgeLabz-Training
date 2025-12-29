import java.util.*;
public class PalindromeChecker{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String text=takeInput();
        boolean result=isPalindrome(text);
        displayResult(text,result);
    }
    //takes string input
    static String takeInput(){
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    // checks palindrome condition
    static boolean isPalindrome(String str) {
        str=str.replaceAll("\\s+", "").toLowerCase();
        int start=0, end=str.length()-1;
        while (start<end) {
            if (str.charAt(start) !=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    // displays result
    static void displayResult(String str, boolean isPal) {
        if (isPal)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
