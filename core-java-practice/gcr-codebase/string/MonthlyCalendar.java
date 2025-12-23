import java.util.*;
public class MonthlyCalendar{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inputMonth= sc.nextInt();   //month input
        int inputYear=sc.nextInt();    // year input
        // formula find the starting day of the month
        int adjustedYear= inputYear -(14 - inputMonth)/ 12;
        int yearPart =adjustedYear + adjustedYear /4-adjustedYear /100+adjustedYear /400;
        int adjustedMonth= inputMonth + 12 * ((14 - inputMonth) / 12) - 2;
        int startDay=(1 + yearPart + (31 * adjustedMonth) / 12) % 7;
        System.out.println(inputMonth + " " + inputYear);
        System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        //print leading tabs for the first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("\t");
        }
        int totalDay;
        //determine number of days in the given month
        if (inputMonth ==2) {
            totalDay =(inputYear % 400 == 0 || (inputYear % 4 == 0 && inputYear % 100 != 0))?29:28;
        } else if (inputMonth == 4|| inputMonth ==6 || inputMonth==9||inputMonth==11){
            totalDay= 30;
        } else{
            totalDay= 31;
        }
        //print calendar dates
        for (int day=1;day<=totalDay;day++) {
            System.out.print(day+"\t");
            //move to next line after Saturday
            if ((day+startDay)%7== 0){
                System.out.println();
            }
        }
    }
}
