import java.util.Arrays;
import java.util.List;
public class SensorReading{
    public static void main(String[] args){
        List<Integer> readings=Arrays.asList(80, 75, 70, 65, 90);
        int threshold=60;
        readings.stream().filter(r ->r>threshold).forEach(r-> System.out.println("High Reading: "+r));
    }
}
