import java.util.*;
public class MaxHandshake{
	public static int calculateHandshake(int n) {
        //formula
        return (n *(n -1))/ 2;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int handshakes= calculateHandshake(n);
        System.out.println("Maximum number of possible handshakes " + handshakes);
    }
}
