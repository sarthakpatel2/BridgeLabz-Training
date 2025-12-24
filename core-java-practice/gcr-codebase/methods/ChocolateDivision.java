import java.util.*;
public class ChocolateDivision{
	public static int[] find(int number, int divisor){
        //formula to find 
        int quotient= number/divisor;
        int remainder= number%divisor;
        return new int[]{quotient, remainder};
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates= sc.nextInt();
        System.out.print("Enter number of children: ");
        int children=sc.nextInt();
        int[] res= find(chocolates, children);
        System.out.println("Each child gets"+res[0]+" chocolates");
        System.out.println("Remaining chocolates"+res[1]);
    }
}
