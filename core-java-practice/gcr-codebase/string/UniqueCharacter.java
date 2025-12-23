import java.util.*;
public class UniqueCharacter{
    public static int findLength(String text) {
        int count= 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    //find unique characters
    public static char[] findUnique(String text) {
        int len = findLength(text);
        char[] temp= new char[len];
        int uniqueCnt= 0;
        //loop till length-1
        for (int i = 0;i< len; i++) {
            char current= text.charAt(i);
            boolean isUnique = true;
            for (int j= 0;j < i; j++) {
                if (current==text.charAt(j)) {
                    isUnique= false;
                    break;
                }
            }
            if (isUnique){
                temp[uniqueCnt]=current;
                uniqueCnt++;
            }
        }
        char[] res= new char[uniqueCnt];
        for (int i =0;i< uniqueCnt;i++) {
            res[i]= temp[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string ");
        String text= sc.nextLine();
        char[] uniqueChar= findUnique(text);
        System.out.print("Unique characters ");
        for (int i= 0;i< uniqueChar.length;i++) {
            System.out.print(uniqueChar[i] +" ");
        }
    }
}