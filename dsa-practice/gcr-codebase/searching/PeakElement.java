public class PeakElement{
    public static int findPeakElement(int[] arr){
        int left=0;
        int right=arr.length-1;
        while (left <right){
            int mid=left+(right-left)/2;
            //if the right neighbor is greater peak lies on the right
            if (arr[mid] <arr[mid+1]){
                left =mid+1;
            }
            // peak lies on the left
            else{
                right=mid;
            }
        }
        //left ==right is the peak index
        return left;
    }
    public static void main(String[] args){
        int[] arr={1,13,20,14,1,9,0};
        int peakIndex=findPeakElement(arr);
        System.out.println("Peak element is "+arr[peakIndex]+" at index "+peakIndex);
    }
}
