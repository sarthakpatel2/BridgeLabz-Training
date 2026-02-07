package oceanfleet;
import java.util.List;
import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        VesselUtil vesselUtil= new VesselUtil();
        System.out.println("Enter the number of vessels to be added");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("Enter vessel details");
        for (int i =0;i< n;i++) {
            String input=sc.nextLine();
            String[] data=input.split(":");
            String vesselId=data[0];
            String vesselName=data[1];
            double averageSpeed= Double.parseDouble(data[2]);
            String vesselType=data[3];
            Vessel vessel =new Vessel(vesselId, vesselName, averageSpeed, vesselType);
            vesselUtil.addVesselPerformance(vessel);
        }
        System.out.println("Enter the Vessel Id to check speed");
        String searchId=sc.nextLine();
        Vessel result=vesselUtil.getVesselById(searchId);
        if (result !=null){
            System.out.println(result.getVesselId()+" | "+result.getVesselName()+" | "+
                    result.getVesselType()+" | "+result.getAverageSpeed()+" knots");
        }else{
            System.out.println("Vessel Id "+searchId +" not found");
        }
        System.out.println("High performance vessels are");
        List<Vessel> highPerformanceVessels=vesselUtil.getHighPerformanceVessels();
        for (Vessel vessel: highPerformanceVessels){
            System.out.println(vessel.getVesselId()+" | "+vessel.getVesselName()+" | "+
                    vessel.getVesselType()+" | "+vessel.getAverageSpeed()+" knots");
        }
    }
}
