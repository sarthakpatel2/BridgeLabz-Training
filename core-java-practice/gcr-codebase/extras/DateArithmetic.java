import java.time.LocalDate;
import java.util.Scanner;
class DateArithmetic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take input date
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate date=LocalDate.parse(sc.nextLine());
        LocalDate result=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        // display result
        System.out.println("Final Date:- "+result);
    }
}
