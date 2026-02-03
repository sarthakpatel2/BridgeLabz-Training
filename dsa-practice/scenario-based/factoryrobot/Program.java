package factoryrobot;
import java.util.Scanner;
public class Program{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        RobotHazardAuditor auditor=new RobotHazardAuditor();
        try{
            System.out.println("Enter Arm Precision between 0 to 1:");
            double armPrecision=sc.nextDouble();
            System.out.println("Enter Worker Density between 1 - 20:");
            int workerDensity=sc.nextInt();
            sc.nextLine();// consume newline
            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState=sc.nextLine();
            double risk=auditor.calculateHazardRisk(armPrecision, workerDensity, machineryState);
            System.out.println("Robot Hazard Risk Score: "+risk);
        }
        catch(RobotSafetyException e){
            System.out.println(e.getMessage());
        }
    }
}
