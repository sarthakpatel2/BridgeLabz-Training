import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class StreamBuzz{
    //inner class for CreatorStats ----
    public static class CreatorStats{
        private String creatorName;
        private double[] weeklyLikes;
        //engagement board
        public static List<CreatorStats> EngagementBoard=new ArrayList<>();
        // Getters and Setters
        public String getCreatorName(){ return creatorName; }
        public void setCreatorName(String creatorName) { this.creatorName=creatorName; }
        public double[] getWeeklyLikes() { return weeklyLikes; }
        public void setWeeklyLikes(double[] weeklyLikes) { this.weeklyLikes=weeklyLikes; }
        @Override
        public String toString() {
            return creatorName+" - "+Arrays.toString(weeklyLikes);
        }
    }

    //methods for Program -----
    public void registerCreator(CreatorStats record){
        CreatorStats.EngagementBoard.add(record);
    }
    public Map<String, Integer> getPostCounts(List<CreatorStats> records, double likeThreshold) {
        Map<String, Integer> result =new LinkedHashMap<>();
        for (CreatorStats creator : records) {
            int count=0;
            for (double likes : creator.getWeeklyLikes()) {
                if (likes >=likeThreshold) count++;
            }
            if (count>0) result.put(creator.getCreatorName(), count);
        }
        return result;
    }
    public double calculateAverageLikes(){
        double sum=0;
        int count= 0;
        for (CreatorStats creator : CreatorStats.EngagementBoard) {
            for (double likes :creator.getWeeklyLikes()) {
                sum +=likes;
                count++;
            }
        }
        return count==0 ? 0:sum/count;
    }
    //main Method -----
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StreamBuzz program=new StreamBuzz();
        while (true){
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            if (sc.hasNextInt()) {
                choice=sc.nextInt();
                sc.nextLine(); //consume newline
            } else{
                System.out.println("Invalid input. Please enter a number.\n");
                sc.nextLine();
                continue;
            }
            switch (choice){
                case 1:
                    CreatorStats creator=new CreatorStats();
                    System.out.print("Enter Creator Name: ");
                    creator.setCreatorName(sc.nextLine());
                    System.out.print("Enter number of weeks: ");
                    int weeks =sc.hasNextInt() ? sc.nextInt() : 4;
                    sc.nextLine();
                    double[] likes=new double[weeks];
                    System.out.println("Enter weekly likes:");
                    for (int i =0;i< weeks;i++){
                        System.out.print("Week "+(i+1)+": ");
                        while (!sc.hasNextDouble()) {
                            System.out.print("Invalid input. Enter a number: ");
                            sc.next();
                        }
                        likes[i] =sc.nextDouble();
                    }
                    sc.nextLine();
                    creator.setWeeklyLikes(likes);
                    program.registerCreator(creator);
                    System.out.println("Creator registered successfully\n");
                    break;
                case 2:
                    System.out.print("Enter like threshold: ");
                    double threshold;
                    if (sc.hasNextDouble()) {
                        threshold=sc.nextDouble();
                        sc.nextLine();
                    } else {
                        System.out.println("Invalid input\n");
                        sc.nextLine();
                        break;
                    }
                    Map<String, Integer> topPosts=program.getPostCounts(CreatorStats.EngagementBoard, threshold);
                    if (topPosts.isEmpty()) {
                        System.out.println("No top-performing posts this week\n");
                    } else{
                        topPosts.entrySet().stream()
                                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                                .forEach(e -> System.out.println(e.getKey()+" - "+e.getValue()));
                        System.out.println();
                    }
                    break;
                case 3:
                    double avg=program.calculateAverageLikes();
                    System.out.printf("Overall average weekly likes: %.2f%n%n", avg);
                    break;
                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice Try again\n");
            }
        }
    }
}
