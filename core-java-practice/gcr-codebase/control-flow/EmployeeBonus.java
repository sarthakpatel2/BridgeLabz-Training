import java.util.*;
class EmployeeBonus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take salary
        System.out.print("Enter salary: ");
        double salary=sc.nextDouble();
        //take years
        System.out.print("Enter years of service ");
        int years=sc.nextInt();
        //initial bonus
        double bonus=0.0;
        //check for bonus(years>5)
        if(years>5){
            bonus=0.05*salary;
        }
        //print bouns amount
        System.out.println("Bonus: "+bonus);
    }
}