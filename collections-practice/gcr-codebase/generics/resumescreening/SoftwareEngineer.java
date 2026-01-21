package resumescreening;

import java.util.Map;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }
    @Override
    public boolean isEligible(Map<String, Integer> skills) {
        return skills.getOrDefault("DSA", 0) >= 7&&
               skills.getOrDefault("SQL", 0)>=6;
    }
}
