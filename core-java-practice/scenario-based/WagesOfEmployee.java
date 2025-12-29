import java.util.Random;
public class WagesOfEmployee{
    // constants
    static final int IS_ABSENT=0;
    static final int IS_FULL_TIME= 1;
    static final int IS_PART_TIME=2;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOURS=8;
    static final int PART_TIME_HOURS=8;
    static final int MAX_WORKING_DAYS=20;
    static final int MAX_WORKING_HOURS=100;
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation:-");
        Random random=new Random();
        int totalWorkingDays=0;
        int totalWorkingHours=0;
        int totalSalary=0;
        // UC5 and UC6:- calculate wages till max days or max hours reached
        while (totalWorkingDays<MAX_WORKING_DAYS && totalWorkingHours<MAX_WORKING_HOURS) {
            totalWorkingDays++;
            int empCheck=random.nextInt(3);
            int empHours=0;
            // UC4:- Switch Case
            switch(empCheck){
                case IS_FULL_TIME:
                    empHours=FULL_DAY_HOURS;
                    System.out.println("Day "+totalWorkingDays+" : Full Time Employee");
                    break;
                case IS_PART_TIME:
                    empHours=PART_TIME_HOURS;
                    System.out.println("Day "+totalWorkingDays+" : Part Time Employee");
                    break;
                default:
                    empHours=0;
                    System.out.println("Day "+totalWorkingDays+" : Employee Absent");
            }
            // check for max working hours
            if (totalWorkingHours+empHours>MAX_WORKING_HOURS){
                empHours=MAX_WORKING_HOURS-totalWorkingHours;
            }
            int dailyWage=empHours*WAGE_PER_HOUR;
            totalWorkingHours+=empHours;
            totalSalary+=dailyWage;
            System.out.println("Hours Worked: "+empHours+" | Daily Wage: "+dailyWage);
        }
        System.out.println("\n------ Monthly Summary ------");
        System.out.println("Total Working Days: "+totalWorkingDays);
        System.out.println("Total Working Hours: "+totalWorkingHours);
        System.out.println("Total Salary: "+totalSalary);
    }
}
