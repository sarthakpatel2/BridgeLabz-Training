import java.util.*;
class CheckNumberIsPositiveNegativeOrZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // input number
        int number=sc.nextInt();
        // check for positive, negative or zero
        if(number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}