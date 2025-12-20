import java.util.*;
class FactorsOfANumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input 
        System.out.print("Enter a number ");
        int number=sc.nextInt();
        //initial maximum size of factors array
        int maxFactor=10;
        int factors[]=new int[maxFactor];
        int maxIndex=0;
        //loop to find factors
        for(int i=1;i<=number;i++){
            if(number%i==0) {
                //check if array is full
                if(maxIndex== maxFactor){
                    maxFactor=maxFactor* 2;
                    int temp[] = new int[maxFactor];
                    //copy old values into new array
                    for(int j= 0;j < factors.length;j++){
                        temp[j]=factors[j];
                    }
                    factors=temp; //store values
                }
                //store factor
                factors[maxIndex]= i;
                maxIndex++;
            }
        }
        //display factors
        System.out.print("Factors of "+number+" are ");
        for(int i=0;i< maxIndex;i++) {
            System.out.print(factors[i]+" ");
        }
    }
}
