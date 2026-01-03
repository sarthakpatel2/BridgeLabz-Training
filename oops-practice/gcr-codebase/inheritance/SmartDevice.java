class Device{
    String deviceId;
    boolean status;
    //constructor of parent 
    Device(String deviceId, boolean status){
        //initialize properties
        this.deviceId=deviceId;
        this.status=status;
    }
    //method to display status
    void displayStatus(){
        System.out.println("Device ID: "+deviceId);
        System.out.println("Status: "+(status? "ON" : "OFF"));
    }
}
//subclass
class Thermostat extends Device{
    int tempSetting;
    //constructor of subclass
    Thermostat(String deviceId,boolean status,int tempSetting){
        //call parent constructor
        super(deviceId, status);
        this.tempSetting=tempSetting;
    }
    @Override
    //method to display status
    void displayStatus(){
        //call parent method
        super.displayStatus();
        System.out.println("Temperature Setting: "+tempSetting+"°C");
    }
}
//main class
public class SmartDevice{
    public static void main(String[] args){
        Thermostat t1=new Thermostat("THERMO01",true,24);
        t1.displayStatus();
    }
}
