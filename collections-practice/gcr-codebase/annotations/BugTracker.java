import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
//used repeatable annotation to allow multiple bugs
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}
public class BugTracker{
    @BugReport(description="Null Pointer Exception")
    @BugReport(description="Index Out of Bounds")
    public void process() {
        System.out.println("Processing");
    }
    public static void main(String[] args) throws Exception{
        Method method =BugTracker.class.getDeclaredMethod("process");
        BugReport[] bugs=method.getAnnotationsByType(BugReport.class);
        for (BugReport bug : bugs){
            System.out.println("Bug: "+bug.description());
        }
    }
}
