import java.util.Arrays;
import java.util.List;
public class StockPrice{
    public static void main(String[] args){
        List<Double> stockPrices=Arrays.asList(112.5, 115.0, 110.75, 118.3);
        stockPrices.forEach(price ->System.out.println("Live Stock Price: "+price));
    }
}
