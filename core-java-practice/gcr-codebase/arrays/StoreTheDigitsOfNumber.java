import java.util.*;
class StoreTheDigitsOfNumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //take number input
        System.out.print("Enter a number ");
        int number=sc.nextInt();
        int maxDigit= 10;
        int[] digit= new int[maxDigit];
        int index =0;
        //extract digits and store in array
        while(number!= 0) {
            if (index ==maxDigit){
                break;
            }
            digit[index]= number%10;// get last digit
            number= number/10;// remove last digit
            index++;
        }
        //initialize largest and second largest
        int largest =0;
        int secondLargest =0;
        //find largest and second largest
        for (int i= 0;i <index;i++){
            if (digit[i]>largest){
                secondLargest= largest;
                largest =digit[i];
            }else if(digit[i]> secondLargest && digit[i]!=largest){
                secondLargest=digit[i];
            }
        }
        //output
        System.out.println("Largest digit " +largest);
        System.out.println("Second largest digit " +secondLargest);
    }
}
