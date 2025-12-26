import java.util.*;
public class Factor{
    public static int[] findFactor(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[idx++] = i;
        return factors;
    }
    public static int greatestFactor(int[] f) {
        return f[f.length - 1];
    }
    public static int sumFactor(int[] f) {
        int sum = 0;
        for (int x : f) sum += x;
        return sum;
    }
    public static int productFactor(int[] f) {
        int prod = 1;
        for (int x : f) prod *= x;
        return prod;
    }
    public static double cubeProduct(int[] f) {
        double prod = 1;
        for (int x : f) prod *= Math.pow(x, 3);
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = findFactor(num);
        System.out.println("Factors are:");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sumFactor(factors));
        System.out.println("Greatest factors: " + greatestFactor(factors));
        System.out.println("Product of factors: " + productFactor(factors));
        System.out.println("Cube product of factors: " + cubeProduct(factors));
    }
}

