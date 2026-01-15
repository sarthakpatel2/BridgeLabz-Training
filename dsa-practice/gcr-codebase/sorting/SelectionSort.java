import java.util.*;
public class SelectionSort{
    static void selectionSort(int[] scores){
        int n=scores.length;
        for (int i =0;i<n-1;i++) {
            int minIndex = i;
            //find minimum element in unsorted part
            for (int j =i+1;j< n;j++) {
                if (scores[j]< scores[minIndex]) {
                    minIndex=j;
                }
            }
            // swap minimum element with first unsorted element
            int temp=scores[minIndex];
            scores[minIndex]=scores[i];
            scores[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] examScores = {78, 45, 89, 62, 55};
        System.out.println(Arrays.toString(examScores));
        selectionSort(examScores);
        System.out.println("After Sorting :-");
        System.out.println(Arrays.toString(examScores));
    }
}
