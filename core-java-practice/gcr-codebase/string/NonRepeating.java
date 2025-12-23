import java.util.Scanner;
public class NonRepeating{
    public static char findNonRepeatingChar(String text) {
        int[] frequency= new int[256];
        for (int i= 0;i<text.length();i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        for (int i =0;i< text.length();i++) {
            char ch = text.charAt(i);
            if (frequency[ch]== 1){
                return ch;
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String text =sc.nextLine();
        char res= findNonRepeatingChar(text);
        if (res!= '\0')
            System.out.println("First non-repeating character " +res);
        else
            System.out.println("No non-repeating character found");
    }
}