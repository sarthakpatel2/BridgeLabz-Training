import java.util.*;
public class LengthOfString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //take user input
        System.out.print("Enter a string: ");
        String text= sc.next();
        int count= 0;
        try{
            //infinite loop to count characters
            while (true) {
                text.charAt(count); //access character at index
                count++;
            }
        }catch (StringIndexOutOfBoundsException e){
            //exception occurs when index exceeds length
        }
        //display results
        System.out.println("Length without using length method " +count);
        System.out.println("Length using built-in length method " +text.length());
    }
}
