import java.util.*;
public class ReverseString{
    // method to reverse a string manually
    static String reverse(String input){
        char[] reverse=new char[input.length()];
        int pos= 0;
        // traverse the string from end to start
        for (int i=input.length()-1;i>=0;i--){
            reverse[pos++]= input.charAt(i);
        }
        return new String(reverse);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String text=sc.nextLine();
        String result= reverse(text);
        System.out.println("Reversed string "+result);
    }
}
