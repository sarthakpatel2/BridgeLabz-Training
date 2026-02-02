import java.lang.reflect.Method;
public class PrivateMethod{
    // private method
    private int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) throws Exception {
        PrivateMethod obj=new PrivateMethod();
        Class<?> cls =obj.getClass();
        Method method=cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int result=(int) method.invoke(obj,3, 4);
        System.out.println("Result: "+result);
    }
}
