import java.util.*;
public class NumberAnalysis{
	public static boolean isPositive(int num){
        //condition for positive number
		return num>=0;
	}
	public static boolean isEven(int num){
        //condition for even
		return num%2== 0;
	}
	public static int compare(int num1,int num2){
		if (num1>num2)
			return 1;
		else if (num1==num2)
			return 0;
		else
			return -1;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] number=new int[5];
		for (int i=0;i<number.length;i++){
			System.out.print("Enter number "+(i+1));
			number[i] = input.nextInt();
			if (isPositive(number[i])){
				if (isEven(number[i]))
					System.out.println("Positive and Even");
				else
					System.out.println("Positive and Odd");
			} else {
				System.out.println("Negative");
			}
		}
		int res=compare(number[0],number[number.length-1]);
		if (res==1) {
			System.out.println("First element is greater than last element");
		} 
		else if (res==0) {
			System.out.println("First and last elements are equal");
		} 
		else {
			System.out.println("First element is less than last element");
		}
	}
}
