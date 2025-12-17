import java.util.*;
class Rev{
  public static void main(String [] args){
    String x="Capgemini";
    String s="";
    for(int i=x.length()-1;i>=0;i--){  //reverse loop
      s+=x.charAt(i); // insert element
    }
    System.out.println(s); // output
  }
}