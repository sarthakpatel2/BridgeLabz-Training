import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
// create Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}
// use Annotation
public class ImportantMethodDemo{
    @ImportantMethod
    public void saveData(){
        System.out.println("Saving data");
    }
    @ImportantMethod(level="LOW")
    public void logData() {
        System.out.println("Logging data");
    }
    public void normalMethod() {
        System.out.println("Normal method");
    }
    //retrieve using Reflection
    public static void main(String[] args){
        Method[] methods=ImportantMethodDemo.class.getDeclaredMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im= method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: "+method.getName()+", Level: "+im.level());
            }
        }
    }
}
