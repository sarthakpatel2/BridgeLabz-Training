package oceanfleet;
import java.util.ArrayList;
import java.util.List;
public class VesselUtil{
    private List<Vessel> vesselList=new ArrayList<>();
    public List<Vessel> getVesselList(){
        return vesselList;
    }
    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList=vesselList;
    }
    //req 1: add vessel performance
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
    // req 2: retrieve vessel by ID (case-sensitive)
    public Vessel getVesselById(String vesselId) {
        for (Vessel vessel :vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
    // req3: retrieve high performance vessels
    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> highPerformanceList = new ArrayList<>();
        double maxSpeed=0.0;
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed=vessel.getAverageSpeed();
            }
        }
        for (Vessel vessel : vesselList){
            if (vessel.getAverageSpeed()==maxSpeed) {
                highPerformanceList.add(vessel);
            }
        }
        return highPerformanceList;
    }
}
