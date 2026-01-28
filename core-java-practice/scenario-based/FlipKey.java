import java.util.*;
class FlipKey{
    public String CleanseAndInvert(String input){
        //null or length<6
        if(input==null || input.length()<6){
            return "";
        }
        //to check no space, digit, or special character
        for(char ch:input.toCharArray()){
            if(!Character.isLetter(ch)){
                return "";
            }
        }
        //convert to lowercase
        input=input.toLowerCase();
        //remove characters with even ASCII values
        StringBuilder filtered=new StringBuilder();
        for(char ch :input.toCharArray()){
            if(((int)ch)%2!=0){   //keep odd ASCII values
                filtered.append(ch);
            }
        }
        //reverse the string
        filtered.reverse();
        //convert even index characters to uppercase
        for (int i=0;i<filtered.length();i++){
            if (i %2==0){
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }
        return filtered.toString();
    }
    public static void main(String[] args) {
        FlipKey obj=new FlipKey();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String input=sc.nextLine();
        String result=obj.CleanseAndInvert(input);
        if (result.isEmpty()){
            System.out.println("Invalid Input");
        }else{
            System.out.println("The generated key is - "+result);
        }
    }
}
