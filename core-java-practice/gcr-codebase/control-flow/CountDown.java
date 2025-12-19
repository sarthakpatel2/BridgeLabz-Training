import java.util.*;
class CountDown{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // input number
        int number=sc.nextInt();
        // counting down
        while(number>=0){
            System.out.print(number);
            number--;
        }
    }
}