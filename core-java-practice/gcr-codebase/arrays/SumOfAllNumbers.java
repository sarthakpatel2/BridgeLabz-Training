import java.util.*;
class SumOfAllNumbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //create array and variable
        double[] arr =new double[10];
        double total=0.0;
        int index= 0;
        //infinite while loop
        while (true) {
            System.out.println("Enter a number");
            double num= sc.nextDouble();
            //check for stop condition
            if (num<= 0) {
                break;
            }
            //check array size limit
            if (index== 10) {
                break;
            }
            //store number in array
            arr[index]= num;
            index++;
        }
        //calculate total using loop
        for (int i=0;i< index;i++) {
            total+=arr[i];
        }
        //display stored numbers
        System.out.println("Stored numbers:");
        for (int i= 0;i< index;i++) {
            System.out.println(arr[i]);
        }
        //display total
        System.out.println("Total sum is " + total);
    }
}
