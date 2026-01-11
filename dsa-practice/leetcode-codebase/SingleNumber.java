public class SingleNumber{
    public int singleNumber(int[] nums){
        int result= 0;
        for (int num :nums) {
            result =result^num;
        }
        return result;
    }
    public static void main(String[] args) {
        SingleNumber sol =new SingleNumber();
        int[] nums={4, 1, 2, 1, 2}; 
        int single=sol.singleNumber(nums);
        System.out.println("The single number is: " + single);
    }
}
