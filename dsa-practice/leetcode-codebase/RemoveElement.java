import java.util.*;
class RemoveElement{
    public int removeElement(int[] nums,int val){
        int k=0;
        for (int n:nums)
            if (n!=val)
                nums[k++]=n;
        return k;
    }
    public static void main(String[] args){
        RemoveElement s=new RemoveElement();
        int[] a ={3, 2, 2, 3};
        int k1=s.removeElement(a, 3);
        System.out.println(k1+" "+Arrays.toString(Arrays.copyOf(a, k1)));
        int[] b={0, 1, 2, 2, 3, 0, 4, 2};
        int k2=s.removeElement(b, 2);
        System.out.println(k2+" "+Arrays.toString(Arrays.copyOf(b,k2)));
    }
}
