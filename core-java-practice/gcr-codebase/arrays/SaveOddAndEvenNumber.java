import java.util.*;
class SaveOddAndEvenNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input from user
        System.out.print("Enter a number ");
        int number= sc.nextInt();
        //check for natural number
        if (number<= 0) {
            System.out.println("Error");
            return; //exit the program
        }
        //create arrays for odd and even numbers
        int size=number/2+1;
        int odd[]=new int[size];
        int even[]=new int[size];
        //index variables
        int oddIndex= 0;
        int evenIndex=0;
        //store odd and even numbers
        for (int i =1;i<=number;i++){
            if (i% 2==0){
                even[evenIndex]=i;
                evenIndex++;
            }else{
                odd[oddIndex]=i;
                oddIndex++;
            }
        }
        //print odd numbers
        System.out.print("Odd numbers ");
        for (int i=0;i<oddIndex;i++) {
            System.out.print(odd[i]+" ");
        }
        //print even numbers
        System.out.print("\nEven numbers ");
        for (int i=0;i <evenIndex;i++) {
            System.out.print(even[i]+" ");
        }
    }
}
