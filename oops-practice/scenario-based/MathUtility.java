class MathUtility {

    //factorial of a number
    public static long factorial(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Factorial not possible for negative numbers");
        }
        long fact =1;
        for (int i=1;i<=n;i++) {
            fact *=i;
        }
        return fact;
    }
    //check if number is prime
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        for (int i = 2;i<=Math.sqrt(n); i++){
            if (n%i== 0)
                return false;
        }
        return true;
    }
    //find GCD of two numbers
    public static int gcd(int a, int b) {
        if (a==0)
            return Math.abs(b);
        if (b==0)
            return Math.abs(a);
        a=Math.abs(a);
        b= Math.abs(b);
        while (b !=0) {
            int temp=b;
            b =a% b;
            a=temp;
        }
        return a;
    }
    //find Fibonacci number
    public static int fibonacci(int n) {
        if (n <0){
            throw new IllegalArgumentException("Fibonacci not possible for negative numbers");
        }
        if (n ==0)
            return 0;
        if (n==1)
            return 1;
        int a=0, b =1, c=0;
        for (int i =2;i<= n;i++){
            c=a +b;
            a=b;
            b= c;
        }
        return c;
    }
    // testing all methods
    public static void main(String[] args){
        // factorial test
        System.out.println("Factorial of 5: "+factorial(5));
        System.out.println("Factorial of 0: "+factorial(0));
        //prime test
        System.out.println("Is 7 prime? " +isPrime(7));
        System.out.println("Is 1 prime? "+isPrime(1));
        System.out.println("Is -5 prime? "+ isPrime(-5));
        // GCD test
        System.out.println("GCD of 12 and 18: "+ gcd(12,18));
        System.out.println("GCD of 0 and 5: "+gcd(0,5));
        System.out.println("GCD of -8 and 16: " +gcd(-8, 16));
        //fibonacci test
        System.out.println("Fibonacci(7): "+fibonacci(7));
        System.out.println("Fibonacci(0): "+ fibonacci(0));
        System.out.println("Fibonacci(1): "+fibonacci(1));
    }
}
