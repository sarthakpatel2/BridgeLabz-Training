import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//invoice class
class Invoice{
    int transactionId;
    public Invoice(int transactionId){
        this.transactionId=transactionId;
    }
    @Override
    public String toString(){
        return "Invoice created for Transaction ID: "+ transactionId;
    }
}
public class InvoiceCreation{
    public static void main(String[] args){
        //transaction IDs
        List<Integer> transactionIds=Arrays.asList(101, 102, 103, 104);
        //using constructor reference
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).collect(Collectors.toList());
        System.out.println("Generated Invoices:");
        invoices.forEach(System.out::println);
    }
}
