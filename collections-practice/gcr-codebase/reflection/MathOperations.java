import java.lang.reflect.Method;
import java.util.Scanner;
public class MathOperations{
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a -b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        MathOperations obj=new MathOperations();
        System.out.print("Enter method name :");
        String methodName=sc.next();
        System.out.print("Enter two numbers: ");
        int x =sc.nextInt();
        int y=sc.nextInt();
        Class<?> cls=obj.getClass();
        Method method=cls.getDeclaredMethod(methodName, int.class, int.class);
        int result=(int) method.invoke(obj, x, y);
        System.out.println("Result: "+result);
    }
}
