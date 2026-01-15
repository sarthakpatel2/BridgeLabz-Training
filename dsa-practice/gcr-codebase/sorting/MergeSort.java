import java.util.*;
public class MergeSort{
    static void merge(double[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right- mid;
        //temporary arrays
        double[] L=new double[n1];
        double[] R=new double[n2];
        //copy data to temp arrays
        for (int i=0;i< n1;i++)
            L[i] =arr[left+ i];
        for (int j = 0;j< n2;j++)
            R[j]=arr[mid +1 +j];
        int i =0,j =0,k=left;
        //merge the temp arrays
        while (i <n1&& j <n2){
            if (L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        //copy remaining elements
        while (i<n1) {
            arr[k]=L[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    //recursive merge sort method
    static void mergeSort(double[] arr, int left,int right){
        if (left<right){
            int mid=(left+right) /2;
            //sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1,right);
            //merge the sorted halves
            merge(arr,left, mid, right);
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n=sc.nextInt();
        double[] prices=new double[n];
        System.out.println("Enter book prices:");
        for (int i =0;i<n;i++){
            prices[i]=sc.nextDouble();
        }
        mergeSort(prices, 0,n-1);
        System.out.println("Sorted Book Prices:");
        for (double price:prices){
            System.out.print(price+ " ");
        }
    }
}
