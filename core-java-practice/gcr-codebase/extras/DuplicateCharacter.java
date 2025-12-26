import java.util.*;
public class DuplicateCharacter{
    //method to remove duplicate characters
    static String removeDuplicates(String text){
        boolean[] visit= new boolean[256];
        //ASCII character tracker
        StringBuilder result= new StringBuilder();
        for (int i=0;i<text.length();i++) {
            char current=text.charAt(i);
            // add character only if it has not appeared before
            if (!visit[current]){
                visit[current]=true;
                result.append(current);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Enter a string :-");
        String input = text.nextLine();
        String output = removeDuplicates(input);
        System.out.println("String after removing duplicates :-" + output);
    }
}
