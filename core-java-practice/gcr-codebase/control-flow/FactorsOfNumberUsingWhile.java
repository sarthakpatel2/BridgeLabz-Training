import java.util.*;
class FactorsOfNumberUsingWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        int number=sc.nextInt();
        //check for natural number
        if(number<=0){
            System.out.print("Enter a positive number");
        }else{
            System.out.print("Factors are: ");
            //finding factors
            int i=1;
            while(i<=number){
                if(number%i==0){
                    System.out.print(i+" ");
                }
                i++;
            }
        }
    }
}