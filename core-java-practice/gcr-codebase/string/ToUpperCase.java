import java.util.*;
public class ToUpperCase{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //taking input from the user
    String text=sc.nextLine();
    // compare both results
    System.out.println(compareUser(text).equals(userDefined(text)));
  }
  public static String compareUser(String str) {
    String result ="";
    for (int i =0;i <str.length();i++) {
      char ch=str.charAt(i);
      //convert upper to uppercase manually
      if (ch>='a'&&ch<='z') {
        ch =(char)(ch-32);
      }
      result=result+ch;
    }
    return result;
  }
  public static String userDefined(String str) {
    return str.toUpperCase();
  }
}