import java.util.*;
class CompareStrings{
    // Correct return type: boolean
    public static boolean compareUsingCharAt(String s1,String s2){
        //base condition
        if (s1.length()!=s2.length()) {
            return false;
        }
        //check 
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1= sc.next();
        String str2 =sc.next();
        boolean result=compareUsingCharAt(str1,str2);
        System.out.println("Result "+result);
    }
}
