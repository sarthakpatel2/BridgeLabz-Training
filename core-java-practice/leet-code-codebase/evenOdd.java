import java.util.*;
class evenOdd{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //use %2 to check
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}