public class FibonacciComparison{
    //recursive fibonacci
    public static int fibonacciRecursive(int n){
        if (n <=1)
            return n;
        return fibonacciRecursive(n -1)+fibonacciRecursive(n-2);
    }
    //iterative Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <=1)
            return n;
        int a=0, b =1,sum=0;
        for (int i =2;i<=n;i++) {
            sum = a+b;
            a =b;
            b=sum;
        }
        return b;
    }
    public static void main(String[] args){
        int n = 30;
        // recursive
        long start =System.currentTimeMillis();
        int recResult= fibonacciRecursive(n);
        long end =System.currentTimeMillis();
        System.out.println("Recursive Fibonacci(" +n+") = " + recResult);
        System.out.println("Recursive Time: " +(end- start) +" ms");
        // iterative
        start=System.currentTimeMillis();
        int itrResult =fibonacciIterative(n);
        end=System.currentTimeMillis();
        System.out.println("Iterative Fibonacci("+n+ ") = " +itrResult);
        System.out.println("Iterative Time: "+(end -start)+" ms");
    }
}
