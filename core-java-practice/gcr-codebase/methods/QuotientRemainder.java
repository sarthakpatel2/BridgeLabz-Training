import java.util.*;
public class QuotientRemainder{
	public static int[] findQuotientAndRemainder(int number, int divisor){
        //basic formula to find quotient and remainder
        int quotient =number /divisor;
        int remainder =number %divisor;
        return new int[]{quotient,remainder};
    }
	public static void main(String[] args) {
        Scanner txt=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number =txt.nextInt();
        System.out.print("Enter divisor: ");
        int divisor= txt.nextInt();
        int[] res= findQuotientAndRemainder(number, divisor);
        System.out.println("Quotient "+res[0]);
        System.out.println("Remainder "+res[1]);
        txt.close();
    }

}
