import java.util.*;
public class QuickSort{
    // quick sort function
    static void quickSort(int[] prices, int low, int high){
        if (low <high){
            int pivotIndex = partition(prices,low,high);
            // recursively sort left and right partitions
            quickSort(prices,low, pivotIndex- 1);
            quickSort(prices, pivotIndex+1,high);
        }
    }
    // partition method
    static int partition(int[] prices, int low, int high) {
        int pivot=prices[high]; // choosing last element as pivot
        int i =low-1;
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // swap prices
                int temp =prices[i];
                prices[i]=prices[j];
                prices[j]=temp;
            }
        }
        // place pivot in correct position
        int temp=prices[i +1];
        prices[i+1]=prices[high];
        prices[high] =temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] productPrices = {450, 1200, 300, 800, 150};
        quickSort(productPrices, 0, productPrices.length -1);
        System.out.println("After Sorting :");
        System.out.println(Arrays.toString(productPrices));
    }
}
