import java.util.Scanner;
public class ToggleCharacter{
    // method to toggle case of characters
    static String toggleCase(String text) {
        char[] res=new char[text.length()];
        for (int i =0;i<text.length();i++) {
            char ch=text.charAt(i);
            if (ch >='A'&&ch<='Z') {
                //convert to lowercase
                res[i]= (char)(ch +32);
            } else if(ch >='a'&&ch<='z'){
                //convert to uppercase
                res[i]= (char)(ch - 32); 
            } else {
                //keep non alphabetic unchanged
                res[i]=ch;
            }
        }
        return new String(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String input = sc.nextLine();
        String output = toggleCase(input);
        System.out.println("Toggled string:- "+output);
    }
}
