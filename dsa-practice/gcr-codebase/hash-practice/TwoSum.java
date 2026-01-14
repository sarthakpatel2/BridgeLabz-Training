import java.util.*;
public class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map =new HashMap<>();
        //traverse through the array
        for (int i=0;i<nums.length;i++) {
            //calculate the required number to reach target
            int complement =target-nums[i];
             //check if the complement already exists in the map
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            // store current number with its index in the map
            map.put(nums[i], i);
        }
        //if no pair is found, return {-1, -1}
        return new int[]{-1, -1};
    }
    //main method
    public static void main(String[] args){
        int[] nums={2, 7, 11, 15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
