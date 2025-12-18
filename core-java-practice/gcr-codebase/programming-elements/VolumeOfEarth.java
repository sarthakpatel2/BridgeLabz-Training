class VolumeOfEarth{
    public static void main(String[] args){
        // radius of earth
        double radius=6378;
        // calculate volume of earth
        double volumeInKm=(4.0/3.0)*3.14*radius*radius*radius;
        //volume in miles
        double volInMiles=volumeInKm*0.621371*0.621371*0.621371;
        // print output
        System.out.print("The Volume of earth in cubic kilometers is "+volumeInKm+" and cubic Miles is "+volInMiles);
    }
}