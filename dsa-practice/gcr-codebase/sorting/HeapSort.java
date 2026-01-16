import java.util.*;
public class HeapSort{
    //heap Sort function
    static void heapSort(int[] salaries){
        int n=salaries.length;
        //build max Heap
        for (int i=n/2-1;i>=0;i--){
            heapify(salaries, n,i);
        }
        //extract elements one by one
        for (int i=n-1;i>0;i--){
            //swap root with last element
            int temp=salaries[0];
            salaries[0]=salaries[i];
            salaries[i]=temp;
            //heapify reduced heap
            heapify(salaries,i,0);
        }
    }
    //heapify method
    static void heapify(int[] arr,int n,int i){
        int highest=i;
        int left=2*i+1;
        int right =2*i+2;
        if (left<n &&arr[left]>arr[highest])
            highest=left;
        if (right<n &&arr[right]>arr[highest])
            highest=right;
        if (highest!=i) {
            int temp=arr[i];
            arr[i]=arr[highest];
            arr[highest]=temp;
            heapify(arr,n,highest);
        }
    }
    public static void main(String[] args){
        int[] salaryDemands = {50000,40000,49000,69000,75000,30000};
        heapSort(salaryDemands);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(salaryDemands));
    }
}