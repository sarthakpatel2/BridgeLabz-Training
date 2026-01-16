import java.util.*;
public class CountingSort{
    static void countingSort(int[] ages){
        int minAge=10;
        int maxAge=18;
        int range=maxAge-minAge+1;
        int[] count=new int[range];
        //count frequencies
        for (int age :ages){
            count[age-minAge]++;
        }
        //rebuild sorted array
        int index=0;
        for (int i=0;i<range;i++){
            while(count[i]>0){
                ages[index++]=i+minAge;
                count[i]--;
            }
        }
    }
    public static void main(String[] args){
        int[] studentAges={12,15,11,14,10,18,13,15};
        countingSort(studentAges);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(studentAges));
    }
}