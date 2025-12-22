import java.util.*;
public class TrimTheSpaces{
    //finds the first and last non-space positions
    static int[] findTrim(String text){
        int start= 0;
        int end= 0;
        //find actual length without using length()
        try{
            while (true){
                text.charAt(end);
                end++;
            }
        } catch(Exception e) {
            end--;  
        }
        //move start forward till non-space
        while (start<=end && text.charAt(start)==' ') {
            start++;
        }
        // move end backward till non-space
        while (end>=start&&text.charAt(end)==' ') {
            end--;
        }
        return new int[]{start,end};
    }
    //creates substring manually using charAt()
    static String makeSubstring(String text,int start,int end) {
        String result = "";
        for (int i =start; i <= end;i++) {
            result+= text.charAt(i);
        }
        return result;
    }
    // Compare two strings using charAt()
    static boolean compare(String a, String b) {
        int i= 0;
        try {
            while (true) {
                if (a.charAt(i) != b.charAt(i))
                    return false;
                i++;
            }
        } catch (Exception e) {
        }
        //check if both ended at same time
        try {
            a.charAt(i);
            return false;
        } catch (Exception e){}
        try {
            b.charAt(i);
            return false;
        } catch (Exception e) {}
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input=sc.nextLine();
        // manual trim logic
        int[] points= findTrim(input);
        String manualTrim =makeSubstring(input, points[0], points[1]);
        // built-in trim
        String builtInTrim= input.trim();
        // compare results
        boolean same= compare(manualTrim, builtInTrim);
        // display output
        System.out.println("\nManual Trim Result ["+manualTrim+"]");
        System.out.println("Built-in Trim [" + builtInTrim+ "]");
        System.out.println("Are both same?  " + same);
    }
}
