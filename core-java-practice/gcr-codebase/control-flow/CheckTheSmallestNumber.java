import java.util.*;
class CheckTheSmallestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input first number
        int number1=sc.nextInt();
        // input second number
        int number2=sc.nextInt();
        // input third number
        int number3=sc.nextInt();
        // compare for smallest number
        if(number1<number2 && number1<number3){
            System.out.println("Yes the first number is smallest");
        }else{
            System.out.println("No the first number is not smallest");
        }
    }
}