import java.util.*;
class SubstringFromString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take input string
        String text =sc.next();
        //take start and end index
        int start = sc.nextInt();
        int end = sc.nextInt();
        //create substring
        String subCharAt = "";
        for (int i=start;i<end;i++){
            subCharAt=subCharAt+text.charAt(i);
        }
        //create substring using built-in method
        String subBuiltIn=text.substring(start,end);
        //compare both strings using charAt()
        boolean isEqual=true;
        if (subCharAt.length()!=subBuiltIn.length()){
            isEqual=false;
        }else{
            for(int i=0;i<subCharAt.length();i++) {
                if (subCharAt.charAt(i)!=subBuiltIn.charAt(i)){
                    isEqual= false;
                    break;
                }
            }
        }
        //display results
        System.out.println("Substring using charAt(): "+subCharAt);
        System.out.println("Substring using substring(): "+subBuiltIn);
        System.out.println("Are both substrings equal?: "+isEqual);
    }
}
