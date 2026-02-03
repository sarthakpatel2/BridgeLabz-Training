import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Claim{
    String type;
    double amount;
    Claim(String type, double amount) {
        this.type=type;
        this.amount=amount;
    }
    public String getType() {
        return type;
    }
    public double getAmount(){
        return amount;
    }
}
public class InsuranceClaimAnalysis{
    public static void main(String[] args) {
        List<Claim> claims=Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Health", 8000),
            new Claim("Vehicle", 12000),
            new Claim("House", 10000),
            new Claim("Life", 20000)
        );
        Map<String, Double> averageClaims=claims.stream()
                  .collect(Collectors.groupingBy(Claim::getType,
                      Collectors.averagingDouble(Claim::getAmount)
                  ));
        averageClaims.forEach((type,avg) ->System.out.println(type+" Average Claim: "+avg));
    }
}
