import java.util.*;
public class PalindromeChecker{
    //iterative comparison using start and end indexes
    static boolean checkIterative(String text) {
        int left= 0;
        int right= text.length() - 1;
        while (left< right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // recursive comparison
    static boolean checkRecursive(String text,int start,int end) {
        if (start>=end) {
            return true;
        }
        if (text.charAt(start)!=text.charAt(end)) {
            return false;
        }
        return checkRecursive(text,start+1,end-1);
    }
    //method to reverse string using charAt()
    static char[] reverseText(String text) {
        char[] reverse = new char[text.length()];
        int index=0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }
    // using character arrays
    static boolean checkUsingArray(String text) {
        char[] original= text.toCharArray();
        char[] reversed=reverseText(text);
        for (int i = 0;i< original.length;i++) {
            if (original[i]!= reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter text ");
        String text= sc.nextLine();
        boolean result1=checkIterative(text);
        boolean result2=checkRecursive(text,0,text.length()-1);
        boolean result3 =checkUsingArray(text);
        System.out.println("\nPalindrome Check Results");
        System.out.println("Logic 1 :"+result1);
        System.out.println("Logic 2 :"+result2);
        System.out.println("Logic 3 :"+result3);
    }
}
