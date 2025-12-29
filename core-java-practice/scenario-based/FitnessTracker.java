import java.util.*;
public class FitnessTracker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] pushUps=new int[7];
        System.out.println("Enter push-ups for 7 days:");
        //taking input from user
        for (int i=0;i<7;i++){
            System.out.print("Day "+(i+1)+": ");
            pushUps[i]=sc.nextInt();
        }
        int totalPushUps=0;
        int workoutDay=0;
        // for-each loop
        for(int count :pushUps){
            // Skip rest days
            if (count==0)
                continue;
            totalPushUps+=count;
            workoutDay++;
        }
        if (workoutDay==0){
            System.out.println("No workouts done this week");
        }else{
            double average=(double) totalPushUps/workoutDay;
            System.out.println("Total push-ups in a week: "+totalPushUps);
            System.out.println("Average push-ups per workout day: "+average);
        }
    }
}
