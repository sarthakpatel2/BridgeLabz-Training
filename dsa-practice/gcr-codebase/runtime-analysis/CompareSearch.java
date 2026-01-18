public class CompareSearch{
    //linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0;i< arr.length;i++) {
            if (arr[i]== target)
                return i;
        }
        return -1;
    }
    //binary Search
    public static int binarySearch(int[] arr, int target) {
        int left =0,right =arr.length-1;
        while (left<=right){
            int mid=(left +right) /2;
            if (arr[mid]==target)
                return mid;
            else if (arr[mid]< target)
                left= mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int n =1000000;
        int[] arr=new int[n];
        for (int i =0;i<n;i++)
            arr[i] =i+1;
        int target =999999;
        //linear Search timing
        long start=System.currentTimeMillis();
        linearSearch(arr, target);
        long end=System.currentTimeMillis();
        System.out.println("Linear Search Time: "+(end- start) + " ms");
        //binary Search timing
        start=System.currentTimeMillis();
        binarySearch(arr,target);
        end=System.currentTimeMillis();
        System.out.println("Binary Search Time: "+(end-start)+" ms");
    }
}
