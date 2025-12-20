import java.util.*;
class BonusOfEmployees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= 10;
        //arrays
        double salary[]= new double[number];
        double service[]= new double[number];
        double bonus[]= new double[number];
        double newSalary[]= new double[number];
        //variables for totals
        double total_Bonus= 0.0;
        double total_OldSalary= 0.0;
        double total_NewSalary= 0.0;
        //input loop
        for (int i= 0;i<number;i++) {
            System.out.println("\nEnter details for Employee " +(i+1));
            System.out.print("Enter Salary ");
            salary[i]= sc.nextDouble();
            System.out.print("Enter Years of Service ");
            service[i]= sc.nextDouble();
            //validation
            if (salary[i]<=0 ||service[i] < 0) {
                System.out.println("Invalid input enter again.");
                i--; // decrement index to retry
            }
        }
        //bonus calculation loop
        for (int i= 0;i<number;i++){
            if (service[i]>5){
                bonus[i]=salary[i] * 0.05;
            }else {
                bonus[i]= salary[i] * 0.02;
            }
            newSalary[i]= salary[i]+ bonus[i];
            total_Bonus+= bonus[i];
            total_OldSalary+= salary[i];
            total_NewSalary+= newSalary[i];
        }
        //output
        System.out.println("Total Old Salary  : " + total_OldSalary);
        System.out.println("Total Bonus Paid  : " + total_Bonus);
        System.out.println("Total New Salary  : " + total_NewSalary);
    }
}
