import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}
public class TaskMAnager{
    //custom annotation @TaskInfo
    @TaskInfo(priority="High", assignedTo ="Sarthak")
    public void completeTask(){
        System.out.println("Task completed");
    }
    public static void main(String[] args) throws Exception {
        Class<TaskMAnager> cls = TaskMAnager.class;
        Method method=cls.getDeclaredMethod("completeTask");
        TaskInfo info=method.getAnnotation(TaskInfo.class);
        System.out.println("Priority: "+info.priority());
        System.out.println("Assigned To: "+info.assignedTo());
    }
}
