import java.util.*;
class FrequencyOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //take number input
        System.out.print("Enter a number ");
        int number= sc.nextInt();
        int temp= number;
        int cnt= 0;
        //find count of digits
        while (temp!= 0) {
            cnt++;
            temp=temp/10;
        }
        //array to store digits
        int digit[]=new int[cnt];
        //store digits in array
        temp =number;
        for (int i=0;i <cnt;i++){
            digit[i]=temp%10;
            temp=temp/10;
        }
        //frequency array
        int frequency[]=new int[10];
        //find frequency of each digit
        for (int i=0;i<cnt;i++) {
            frequency[digit[i]]++;
        }
        //display frequency
        System.out.println("\nDigit Frequency:");
        for (int i= 0; i<10;i++) {
            if (frequency[i]>0) {
                System.out.println("Digit "+i+" occurs "+frequency[i]+"time(s)");
            }
        }
    }
}
