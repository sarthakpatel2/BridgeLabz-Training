public class LegacyAPI{
    @Deprecated //used @deprecated for old method
    void oldFeature() {
        System.out.println("Old feature ");
    }
    void newFeature() {
        System.out.println("New and improved feature");
    }
    public static void main(String[] args){
        LegacyAPI api =new LegacyAPI();
        api.oldFeature();   //warning 
        api.newFeature();
    }
}
