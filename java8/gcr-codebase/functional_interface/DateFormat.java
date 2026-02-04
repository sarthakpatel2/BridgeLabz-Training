import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
interface DateUtils{
    static String formatDate(LocalDate date, String pattern){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
public class DateFormat{
    public static void main(String[] args){
        LocalDate today=LocalDate.now();
        String format1=DateUtils.formatDate(today, "dd-MM-yyyy");
        String format2=DateUtils.formatDate(today, "yyyy/MM/dd");
        System.out.println("Invoice Date: "+format1);
        System.out.println("Invoice Date: "+format2);
    }
}
