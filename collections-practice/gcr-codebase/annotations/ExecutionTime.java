import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}
public class ExecutionTime{
    @LogExecutionTime
    public void fastMethod(){
        for (int i=0;i<1000;i++);
    }
    @LogExecutionTime
    public void slowMethod() {
        for (int i=0;i< 1000000;i++);
    }
    public static void main(String[] args) throws Exception{
        ExecutionTime obj =new ExecutionTime();
        Method[] methods=ExecutionTime.class.getDeclaredMethods();
        for (Method method: methods){
            if (method.isAnnotationPresent(LogExecutionTime.class)){
                long start =System.nanoTime();
                method.invoke(obj);
                long end =System.nanoTime();
                System.out.println(
                    method.getName()+" executed in "+(end-start)+" ns"
                );
            }
        }
    }
}
