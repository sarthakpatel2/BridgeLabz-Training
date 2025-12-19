import java.util.*;
class FindAllMultiples{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take input
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        //check natural number and less than 100
        if(number<=0 || number>=100){
            System.out.print("Enter a positive number less than 100");
        }else{
            System.out.print("Multiples of "+number+" are: ");
            //run  for loop backward from 100 to 1
            for(int i=100;i>=1;i--){
                //check multiple
                if(i%number==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}