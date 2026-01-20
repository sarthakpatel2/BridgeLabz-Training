import java.util.*;
public class SortedSquares{
    public static void main(String[] args){
        int[] nums ={-7, -3, 2, 3, 11};
        int n =nums.length;
        int[] result= new int[n];
        int left =0,right=n-1,idx=n-1;
        while (left<=right) {
            int leftSq =nums[left]*nums[left];
            int rightSq =nums[right]*nums[right];
            if (leftSq > rightSq) {
                result[idx--] = leftSq;
                left++;
            } else{
                result[idx--] =rightSq;
                right--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
