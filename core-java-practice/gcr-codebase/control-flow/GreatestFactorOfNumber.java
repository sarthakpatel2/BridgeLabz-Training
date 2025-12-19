import java.util.*;
class GreatestFactorOfNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take input
        int number=sc.nextInt();
        //initialize
        int greatestFactor=1;
        //finding greatest factor
        for (int i=number-1;i>=1;i--) {
            if (number%i==0) {
                greatestFactor=i;
                break;
            }
        }
        //print result
        
    }
}