import java.util.*;
public class LinearAndBinary{
    //Linear Search --------
    //find the first missing positive integer
    public static int firstMissingPositive(int[] nums){
        int n=nums.length;
        //replace invalid numbers
        for (int i=0;i< n;i++){
            if (nums[i]<=0|| nums[i]>n){
                nums[i]=n+1;
            }
        }
        //mark visited numbers
        for (int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            if (val>=1 && val<=n) {
                if (nums[val- 1]>0) {
                    nums[val-1]= -nums[val- 1];
                }
            }
        }
        //find first positive index
        for (int i=0;i< n;i++) {
            if (nums[i] >0){
                return i +1;
            }
        }
        return n+1;
    }
    //Binary Search --------
    public static int binarySearch(int[] nums, int target){
        int left =0,right=nums.length-1;
        while (left<=right){
            int mid=left +(right -left)/2;
            if (nums[mid]==target)
                return mid;
            else if (nums[mid]<target)
                left=mid+1;
            else
                right=mid- 1;
        }
        return -1;
    }
    //Main --------
    public static void main(String[] args){
        int[] arr={3, 4, -1,1};
        int target=4;
        //copy array as firstMissingPositive modifies it
        int[] copyForMissing=arr.clone();
        int missing=firstMissingPositive(copyForMissing);
        System.out.println("First Missing Positive Integer: "+missing);
        //binary search requires sorting
        Arrays.sort(arr);
        int index=binarySearch(arr, target);
        System.out.println("Index of target "+target+": "+index);
    }
}