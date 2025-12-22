import java.util.*;
class IndexOutOfBoundException{
    //generate exception
    static void exception(String text){
            System.out.println(text.charAt(text.length()));
    }
    //method to handle the exception
    static void handleException(String text){
        try {
            System.out.println(text.charAt(text.length()));
        } catch (Exception e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled");
        }
    }
    //main method block
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //string text
        String text=sc.next();
        System.out.println("StringOutOfBoundException");
        exception(text);
        System.out.println("Handle StringOutOfBoundIndexException");
        handleException(text);    
    }
}