import java.util.*;
public class MinMax{
	public static int[] find(int number1,int number2,int number3) {
        //find the smallest and largest
        int smallest= Math.min(number1,Math.min(number2,number3));
        int largest =Math.max(number1,Math.max(number2,number3));
        return new int[]{smallest,largest};
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first, second and third number: ");
        int num1 =sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int[] result= find(num1,num2, num3);
        System.out.println("Smallest "+result[0]);
        System.out.println("Largest "+result[1]);
    }
}
