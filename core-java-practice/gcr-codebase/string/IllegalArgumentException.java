import java.util.*;
class IllegalArgumentException{
    //generate exception
    public static void exception(String text){
        System.out.println(text.substring(-1));
    }
    //handle the exception
    public static void handleException(String text){
        try{
            System.out.println(text.substring(-1));
        }catch (Exception e){
            System.out.println("IllegalArgumentException caught and handled.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        //generate exception
        System.out.println("Generating exception");
        exception(text);
        //handle exception
        System.out.println("Handle exception");
        handleException(text);
    }
}