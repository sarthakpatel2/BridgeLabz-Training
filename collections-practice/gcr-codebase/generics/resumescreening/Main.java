package resumescreening;
import java.util.*;
public class Main{
    public static void main(String[] args){
        // skill sets
        Map<String, Integer> seSkills = Map.of("DSA", 8,"Java", 7);
        Map<String, Integer> dsSkills = Map.of("Python", 8,"ML", 6);
        Map<String, Integer> pmSkills = Map.of("Communication", 9,"Management", 8);
        // creating resumes
        Resume<SoftwareEngineer> r1=new Resume<>("Sarthak", new SoftwareEngineer(), seSkills);
        Resume<DataScientist> r2=new Resume<>("Sanjh", new DataScientist(), dsSkills);
        Resume<ProductManager> r3=new Resume<>("Aman", new ProductManager(), pmSkills);
        // list with wildcards
        List<Resume<? extends JobRole>> resumeList =new ArrayList<>();
        resumeList.add(r1);
        resumeList.add(r2);
        resumeList.add(r3);
        // process resumes
        ScreeningPipeline.processAllResumes(resumeList);
    }
}
