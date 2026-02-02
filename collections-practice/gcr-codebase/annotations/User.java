import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}
public class User{
    @MaxLength(10)
    private String username;
    public User(String username) throws Exception {
        Field field =this.getClass().getDeclaredField("username");
        MaxLength max=field.getAnnotation(MaxLength.class);
        if (username.length()>max.value()) {
            throw new IllegalArgumentException("Username too long");
        }
        this.username=username;
        System.out.println("User created: "+username);
    }
    public static void main(String[] args) throws Exception{
        new User("Sarthak"); // okay
        new User("qwertyuioplkjgfss"); //exception
    }
}
