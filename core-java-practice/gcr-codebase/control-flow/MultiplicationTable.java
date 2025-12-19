import java.util.*;
class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take input
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        //multiplication from 6 to 9
        for(int i=6;i<=9;i++){
            //print table
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
}