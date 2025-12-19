import java.util.*;
class PowerOfNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        System.out.print("Enter the power:");
        int power=sc.nextInt();
        // check for positive numbers
        if(number<=0 || power<0){
            System.out.print("Enter positive numbers");
        }else{
            int result=1;
            //calculate power
            for(int i=1;i<=power;i++){
                result=result*number;
            }
            //print result
            System.out.print(number+" ^ "+power+" is: "+result);
        }
    }
}