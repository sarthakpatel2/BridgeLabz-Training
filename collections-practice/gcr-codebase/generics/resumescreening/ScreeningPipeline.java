package resumescreening;
import java.util.*;
// screening pipeline using wildcards
public class ScreeningPipeline{
    public static void processAllResumes(
            List<? extends Resume<? extends JobRole>> resumes){
        for (Resume<? extends JobRole> resume : resumes) {
            resume.screenResume();
        }
    }
}
