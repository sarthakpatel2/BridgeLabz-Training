public class MostWater{
    public static int maxArea(int[] height) {
        int left =0, right =height.length-1;
        int max=0;
        while (left <right){
            int area =Math.min(height[left], height[right])*(right-left);
            max =Math.max(max, area);
            if (height[left] <height[right])
                left++;
            else
                right--;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {1,2,3,4,5,67,78,9,10};
        System.out.println("Maximum water: "+maxArea(height));
    }
}
