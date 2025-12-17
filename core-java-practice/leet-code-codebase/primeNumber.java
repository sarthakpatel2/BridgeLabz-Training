import java.util.*;
class Prime{
    public static void main(String[] args) {
        int num, i, c;
        for (num=2; num<100; num++) {
            c = 0;
            for (i= 2; i<=num/ 2; i++) {
                if (num % i == 0) {
                    c++;
                    break;
                }
            }
            if (c== 0) {
                System.out.print(num+" ");
            }
        }
    }
}
