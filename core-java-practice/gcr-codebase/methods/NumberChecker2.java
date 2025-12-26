import java.util.*;
public class NumberChecker2{
	public static int countDigit(int num) {
		int count = 0;
		while(num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
	public static int[] storeDigit(int num, int count) {
		int digits[] = new int[count];
		int index = count - 1;
		while(num != 0) {
			digits[index--]  = num % 10;
			num /= 10;
		}
		return digits;
	}
	public static int sumOfDigit(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
	public static int sumOfSquaresOfDigit(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
	public static boolean Harshad(int number, int[] digits) {
        int sum = sumOfDigit(digits);
        return number % sum == 0;
    }
	public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int count = countDigit(num);
        int[] digits = storeDigit(num, count);

        System.out.println("Number of digits: " + count);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = sumOfDigit(digits);
        System.out.println("Sum of digits: " + sum);
        int sumSquares = sumOfSquaresOfDigit(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Is Harshad Number: " +Harshad(num, digits));
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "    " + frequency[i][1]);
            }
        }
	}
}
