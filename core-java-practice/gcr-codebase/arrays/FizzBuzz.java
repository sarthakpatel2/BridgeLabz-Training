import java.util.*;
class FizzBuzz{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //input
        System.out.print("Enter a number");
        int number=sc.nextInt();
        //create string array to store results
        String answer[]= new String[number+1];
        //loop from 0 to number and save value
        for (int i=0;i<=number;i++){
            if(i!=0&&i% 3== 0&&i %5== 0){
                answer[i]= "FizzBuzz";
            } else if(i!= 0&& i% 3==0) {
                answer[i]="Fizz";
            } else if (i !=0 &&i %5== 0) {
                answer[i]="Buzz";
            } else {
                answer[i]=String.valueOf(i);
            }
        }
        //display results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position "+i+" = " + answer[i]);
        }
    }
}
