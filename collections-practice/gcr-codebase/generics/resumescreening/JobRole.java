package resumescreening;
import java.util.*;
// abstract base class
public abstract class JobRole{
    private String roleName;
    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
    // each role defines its own eligibility logic
    public abstract boolean isEligible(Map<String, Integer> skills);
}
