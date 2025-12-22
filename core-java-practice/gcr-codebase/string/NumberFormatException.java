import java.util.*;
class NumberFormatException{
    //method to generate exception
    public static void exception(String text){
        //converting text to number
        int number=Integer.parseInt(text);
        System.out.println("Converted number "+number);
    }
    //method to handle exception
    public static void handleException(String text){
        try{
            int number=Integer.parseInt(text);
            System.out.println("Converted number "+ number);
        }catch (Exception e){
            System.out.println("NumberFormatException caught and handled");
        }
    }
    //main block
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking user input 
        System.out.print("Enter a value");
        String text= sc.next();
        //call method to generate exception
        System.out.println("Generating NumberFormatException");
        exception(text);
        //call method to handle exception
        System.out.println("Handling NumberFormatException");
        handleException(text);
    }
}
