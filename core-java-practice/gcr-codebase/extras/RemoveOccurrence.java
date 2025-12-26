import java.util.Scanner;
public class RemoveOccurrence{
    // Method to remove all occurrences of a character
    static String removeCharacter(String text,char target){
        StringBuilder result=new StringBuilder();
        for (int i=0;i<text.length();i++) {
            char current=text.charAt(i);
            // append only if current character is not the target
            if (current!=target) {
                result.append(current);
            }
        }
        //return to string
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take the user input for string
        System.out.print("Enter a string:- ");
        String input= sc.nextLine();
        //take input for character to be removed
        System.out.print("Enter character to remove:-");
        char ch=sc.next().charAt(0);
        //display the remaining string
        String output= removeCharacter(input, ch);
        System.out.println("Resulting string:- "+output);
    }
}
