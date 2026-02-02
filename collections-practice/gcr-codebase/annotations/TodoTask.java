import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
// create Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
//apply Annotation
public class TodoTask{
    @Todo(task="Add login feature", assignedTo = "Sarthak", priority ="HIGH")
    public void login() {}
    @Todo(task="Improve UI", assignedTo ="Sanjh")
    public void dashboard() {}
    @Todo(task="Fix bug", assignedTo="Ayushi", priority ="LOW")
    public void logout() {}
    //retrieve using Reflection
    public static void main(String[] args) {
        Method[] methods =TodoTask.class.getDeclaredMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(Todo.class)){
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: "+method.getName());
                System.out.println(" Task: "+todo.task());
                System.out.println(" Assigned To: "+ todo.assignedTo());
                System.out.println(" Priority: "+todo.priority());
                System.out.println(" ");
            }
        }
    }
}
