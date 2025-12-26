import java.util.*;
public class FriendInformation{
    public static int Youngest(int[] ages){
        int minIndex=0;
        //find the youngest
        for (int i =1;i<ages.length;i++){
            if (ages[i]<ages[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static int Tallest(double[] heights){
        int maxIndex=0;
        //find the tallest
        for (int i=1;i<heights.length;i++){
            if (heights[i]>heights[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //given friends
        String[] names={"Amar","Akbar","Anthony"};
        int age[]=new int[3];
        double[] height=new double[3];

        for (int i=0;i<3;i++){
            //take input of age and height
            System.out.print("Enter age of "+names[i]);
            age[i]=input.nextInt();
            System.out.print("Enter height of "+names[i]);
            height[i]=input.nextDouble();
        }
        int youngestIdx=Youngest(age);
        int tallestIdx=Tallest(height);
        //display the result
        System.out.println("Youngest friend is: "+names[youngestIdx]);
        System.out.println("Tallest friend is: "+names[tallestIdx]);
    }
}
