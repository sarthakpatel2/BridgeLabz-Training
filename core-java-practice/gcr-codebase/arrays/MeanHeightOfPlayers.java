import java.util.*;
class MeanHeightOfPlayers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //create array of size 11
        double[] heights= new double[11];
        double heightSum =0.0;
        //take input of heights
        System.out.println("Enter the heights of 11 players");
        for (int i=0;i< heights.length;i++){
            heights[i]= sc.nextDouble();
            heightSum=heightSum+heights[i];
        }
        //calculate mean height
        double meanHeight =heightSum/11;
        //print the mean height
        System.out.println("Mean height of the football team = "+meanHeight);
    }
}
