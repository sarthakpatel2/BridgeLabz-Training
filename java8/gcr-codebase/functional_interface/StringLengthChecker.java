import java.util.function.Function;
public class StringLengthChecker{
    public static void main(String[] args){
        int maxLimit=20;
        //function - transforms input to output
        Function<String, Integer>lengthCalculator=message ->message.length();
        String message="I am Batman";
        int length=lengthCalculator.apply(message);
        if (length>maxLimit){
            System.out.println("Message exceeds limit");
        }else{
            System.out.println("Message is within limit");
        }
        System.out.println("Message length: "+length);
    }
}
