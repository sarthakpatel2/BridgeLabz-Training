import java.util.*;
public class Calendar{
    // Month names array
    static String[] months = {"", "January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
    // days in month array
    static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //get month name
    public static String getMonth(int month) {
        return months[month];
    }
    // leap year check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // get number of days in month
    public static int getDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month];
    }
    // Get first day of month (Gregorian formula)
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }
    // print calendar
    public static void printCalendar(int month, int year) {
        System.out.println("\n" + getMonth(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(month, year);
        int totalDays = getDays(month, year);
        // First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        //Second loop to print days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }
}
