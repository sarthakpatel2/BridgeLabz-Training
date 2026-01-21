package resumescreening;
import java.util.*;
public class ProductManager extends JobRole{
    public ProductManager() {
        super("Product Manager");
    }
    @Override
    public boolean isEligible(Map<String, Integer> skills){
        return skills.getOrDefault("Communication", 0) >=8&& skills.getOrDefault("Management", 0) >=7;
    }
}
