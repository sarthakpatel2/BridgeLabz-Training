import java.util.*;
class swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //using XOR operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}