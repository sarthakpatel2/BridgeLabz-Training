@FunctionalInterface
interface LightBehavior{
    void activate();
}
class SmartLight{
    public void triggerLight(String trigger, LightBehavior behavior){
        System.out.println("Trigger: "+trigger);
        behavior.activate();
        System.out.println(" ");
    }
}
public class SmartHomeLighting{
    public static void main(String[] args){
        SmartLight light=new SmartLight();
        // motion Trigger using Lambda
        light.triggerLight("Motion Sensor", () ->{
            System.out.println("Lights ON with motion");
        });
        //time of day trigger using Lambda
        light.triggerLight("Night Time", ()->{
            System.out.println("Lights ON in dim night mode");
        });
        //voice command trigger using Lambda
        light.triggerLight("Voice Command", ()->{
            System.out.println("Lights ON via voice");
        });
    }
}
