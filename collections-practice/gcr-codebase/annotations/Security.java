import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed{
    String value();
}
public class Security{
    static String currentUserRole="USER"; //change to ADMIN
    @RoleAllowed("ADMIN")
    public void deleteData() {
        System.out.println("Data deleted");
    }
    public static void main(String[] args) throws Exception{
        Security obj=new Security();
        Method method =obj.getClass().getDeclaredMethod("deleteData");
        RoleAllowed role=method.getAnnotation(RoleAllowed.class);
        if (role.value().equals(currentUserRole)){
            method.invoke(obj);
        } else{
            System.out.println("Access Denied");
        }
    }
}
