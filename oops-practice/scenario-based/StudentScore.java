import java.util.*;
public class StudentScore{
    public static void main(String[] args){
        //get number of students and their scores
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int scores []=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            while (true){
                System.out.print("Enter score for student "+(i +1)+": ");
                if (sc.hasNextInt()){
                    int score=sc.nextInt();
                    if (score>=0){
                        //check for valid score
                        scores[i]=score;
                        //calculate sum
                        sum+=score;
                        break;
                    }else{
                        //if invalid score
                        System.out.println("Score cannot be negative");
                    }
                }else{
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
        //calculate average
        double average=(double) sum/n;
        int highest =scores[0];
        int lowest=scores[0];
        //check for highest and lowest score
        for (int score: scores){
            if (score>highest)
                highest=score;
            if (score<lowest)
                lowest=score;
        }
        //display the results
        System.out.println("\nAverage Score: "+average);
        System.out.println("Highest Score: "+highest);
        System.out.println("Lowest Score: "+lowest);
        System.out.println("Scores above average:");
        //display scores and average
        for (int score :scores){
            if (score>average){
                System.out.print(score+" ");
            }
        }
    }
}
