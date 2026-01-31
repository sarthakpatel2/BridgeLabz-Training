package junit.exception;
public class ExceptionPractice{
    public int divide(int a, int b) {
        if (b==0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }
}
