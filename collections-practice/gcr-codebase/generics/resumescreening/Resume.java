package resumescreening;
import java.util.*;
// generic resume class
public class Resume<T extends JobRole>{
    private String candidateName;
    private T jobRole;
    private Map<String, Integer> skills;
    public Resume(String candidateName, T jobRole, Map<String, Integer> skills) {
        this.candidateName=candidateName;
        this.jobRole=jobRole;
        this.skills= skills;
    }
    public void screenResume() {
        System.out.println("Screening resume for: "+candidateName);
        System.out.println("Applied Role: " + jobRole.getRoleName());
        if (jobRole.isEligible(skills)) {
            System.out.println("Result: Selected\n");
        } else{
            System.out.println("Result: Rejected\n");
        }
    }
}
