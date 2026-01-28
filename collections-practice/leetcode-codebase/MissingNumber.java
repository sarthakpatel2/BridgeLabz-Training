public class MissingNumber{
    public static int findMissing(int[] arr) {
        int left=0,right=arr.length-1;
        int start =arr[0];
        while (left<=right) {
            int mid=left+(right-left)/2;
            if (arr[mid]==start+mid){
                left =mid+1;
            }else{
                right=mid-1;
            }
        }
        return start+left;
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,9};
        System.out.println("Missing number: "+findMissing(arr));
    }
}
