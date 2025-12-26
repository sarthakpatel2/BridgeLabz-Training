import java.util.*;
public class PalindromeString{
    //method to check palindrome
    static boolean isPalindrome(String text){
        int start=0;
        int end=text.length()-1;
        // compare characters from both ends
        while (start<end) {
            if (text.charAt(start)!=text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //string input
        System.out.print("Enter a string ");
        String input=sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }
}
