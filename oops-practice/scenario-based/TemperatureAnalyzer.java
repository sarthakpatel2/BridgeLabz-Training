public class TemperatureAnalyzer{
    //method to analyze temperature data
    public static void analyzeTemp(float[][] temp){
        float maximumTemp=Float.MIN_VALUE;
        float minimumTemp= Float.MAX_VALUE;
        int hottestDay=0;
        int coldestDay=0;
        System.out.println("Average temperature per day:");
        for (int day=0;day<7;day++){
            float sum=0;
            for (int hour=0; hour<24;hour++){
                //accessing temperature
                float current =temp[day][hour];
                sum+=current;
                //check for hottest and coldest
                if (current>maximumTemp){
                    maximumTemp=current;
                    hottestDay=day+1;
                }
                if (current<minimumTemp){
                    minimumTemp=current;
                    coldestDay=day+1;
                }
            }
            //calculate average
            float avg=sum/24;
            System.out.println("Day "+(day+1) +" Average: "+avg);
        }
        System.out.println("Hottest Day: Day "+hottestDay+" (Temp: " +maximumTemp+")");
        System.out.println("Coldest Day: Day "+coldestDay+" (Temp: "+minimumTemp+")");
    }
    public static void main(String[] args){
        //sample data
        float[][] temperatures=new float[7][24];
        for (int i=0;i<7;i++){
            for (int j=0;j<24;j++){
                temperatures[i][j]=(float) (20+Math.random()*15);
            }
        }
        analyzeTemp(temperatures);
    }
}
