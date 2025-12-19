import java.util.*;
class OddAndEvenNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take the end value
        System.out.print("Enter the end value:");
        int number=sc.nextInt();
        //loop from 1 to end
        for(int i=1;i<=number;i++){
            //check for odd or even
            if(i%2==0){
                System.out.println(i+" is Even number");
            }else{
                System.out.println(i+" is Odd number");
            }
        }
    }
}