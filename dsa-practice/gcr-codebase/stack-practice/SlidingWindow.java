import java.util.*;
public class SlidingWindow{
    public static int[] maxSlidingWindow(int[] nums,int k){
        if (nums ==null || k<=0) return new int[0];
        int n=nums.length;
        int[] result =new int[n-k +1];
        Deque<Integer> deque=new LinkedList<>();
        for (int i=0;i <n;i++){
            //remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() <=i-k){
                deque.pollFirst();
            }
            //remove smaller elements from back
            while (!deque.isEmpty() &&nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }
            //add current index
            deque.offerLast(i);
            //store result once first window is complete
            if (i >=k-1){
                result[i-k+1]=nums[deque.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
}
