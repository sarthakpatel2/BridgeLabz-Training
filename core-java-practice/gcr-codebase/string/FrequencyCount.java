import java.util.*;
public class FrequencyCount{
    // Returns a 2D array containing ASCII value and frequency
    static int[][] calculateFrequency(String input) {
        int[] asciiCount= new int[256];
        //count characters using charAt()
        for (int i = 0;i<input.length();i++) {
            asciiCount[input.charAt(i)]++;
        }
        int uniqueChars = 0;
        for (int i=0;i< asciiCount.length;i++) {
            if (asciiCount[i]!= 0) {
                uniqueChars++;
            }
        }
        int[][] output = new int[uniqueChars][2];
        int pos = 0;
        //store character ASCII and frequency
        for (int i = 0; i < asciiCount.length; i++) {
            if (asciiCount[i]!= 0) {
                output[pos][0]= i;
                output[pos][1]= asciiCount[i];
                pos++;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter text: ");
        String text= input.nextLine();
        int[][] result =calculateFrequency(text);
        System.out.println("Character Frequency:");
        for(int i=0;i< result.length;i++) {
            System.out.println((char) result[i][0]+result[i][1]);
        }
    }
}
