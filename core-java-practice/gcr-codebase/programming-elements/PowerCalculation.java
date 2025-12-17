import java.util.*;
class PowerCalculation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //power input
        Double power=sc.nextDouble();
        //exponent input
        Double exponent=sc.nextDouble();
        //power calculation
        Double res=Math.pow(power,exponent);
        System.out.println("Result:"+res);
    }

}