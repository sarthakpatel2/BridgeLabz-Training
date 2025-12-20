import java.util.*;
class ReverseNumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //take number input
        System.out.print("Enter a number");
        int number= sc.nextInt();
        int temp= number;
        int c=0;
        //find count of digits
        while (temp!= 0) {
            c++;
            temp =temp /10;
        }
        int digit[] =new int[c];
        int rev[]= new int[c];
        //store digits in array
        temp =number;
        for (int i =0;i <c;i++) {
            digit[i]=temp%10;
            temp= temp/10;
        }
        //store digits in reverse order
        for (int i =0;i <c;i++) {
            rev[i]= digit[c-1-i];
        }
        //display reversed number
        System.out.print("Reversed Number ");
        for (int i= 0;i< c;i++) {
            System.out.print(rev[i]);
        }
    }
}
