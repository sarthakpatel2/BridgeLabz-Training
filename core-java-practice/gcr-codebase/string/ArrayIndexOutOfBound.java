import java.util.*;
public class ArrayIndexOutOfBound{
  //this is to generate exception
  public static void exception(String text) {
    for (int i =text.length()+2;i<text.length();i++) {
      System.out.println(text.charAt(i));
    }
  }
  //this is to catch the illegal argument
  public static void handleException(String text) {
    try{
      for(int i=text.length() +2;i<text.length();i++){
        System.out.println(text.charAt(i));
      }
    } catch(IndexOutOfBoundsException e){
      System.out.println(" IndexOutOfBoundsException caught");
    }
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //taking input from the user
    String text= sc.next();
    try{
      exception(text);
    } catch (IndexOutOfBoundsException e){
      System.out.println("IndexOutOfBoundsException occur");
    }
    handleException(text);
  }
}