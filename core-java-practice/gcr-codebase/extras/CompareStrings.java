import java.util.*;
public class CompareStrings{
    // method to compare two strings lexicographically
    static int compare(String first, String second) {
        int minLength=first.length()<second.length()? first.length():second.length();
        // Compare characters one by one
        for (int i =0;i<minLength;i++) {
            char ch1=first.charAt(i);
            char ch2=second.charAt(i);
            if (ch1!=ch2){
                // ASCII difference decides order
                return ch1-ch2;
            }
        }
        // if all characters are equal till min length
        return first.length()-second.length();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string:-");
        String str1= sc.nextLine();
        System.out.print("Enter second string:-");
        String str2=sc.nextLine();
        int result= compare(str1, str2);
        if (result==0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println(str1+" comes before "+str2+"in lexicographical order");
        } else {
            System.out.println(str1+" comes before "+str2+" in lexicographical order");
        }
    }
}
