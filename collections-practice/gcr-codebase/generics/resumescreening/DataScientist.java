package resumescreening;
import java.util.*;
public class DataScientist extends JobRole{
    public DataScientist() {
        super("Data Scientist");
    }
    @Override
    public boolean isEligible(Map<String, Integer> skills) {
        return skills.getOrDefault("Python", 0) >= 7 &&
               skills.getOrDefault("ML", 0) >= 6;
    }
}
