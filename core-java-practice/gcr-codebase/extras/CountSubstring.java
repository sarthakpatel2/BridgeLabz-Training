import java.util.*;
public class CountSubstring{
    // method to count occurrences of a substring
    static int count(String text,String pattern) {
        int count=0;
        int txtLength=text.length();
        int patternLength=pattern.length();
        // slide over the main string
        for (int i=0;i<=txtLength-patternLength;i++) {
            int j;
            // check character-by-character match
            for (j=0;j<patternLength;j++) {
                if (text.charAt(i+j)!=pattern.charAt(j)) {
                    break;
                }
            }
            //if full pattern matched
            if (j==patternLength) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainText=input.nextLine();
        System.out.print("Enter the substring :-");
        String subText=input.nextLine();
        int result =count(mainText,subText);
        System.out.println("Occurrences:- "+result);
    }
}
