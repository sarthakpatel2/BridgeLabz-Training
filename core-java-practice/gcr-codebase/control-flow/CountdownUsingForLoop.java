import java.util.*;
class CountdownUsingForLoop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // input number
        int number=sc.nextInt();
        // counting down using for loop to 0
        for(int i=number;i>=0;i--){
            System.out.println(i);
        }
    }
}