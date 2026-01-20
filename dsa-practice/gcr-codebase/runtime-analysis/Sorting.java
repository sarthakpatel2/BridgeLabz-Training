import java.util.*;
public class Sorting{
  //bubble Sort ----------
  public void bubbleSort(int[] arr) {
    for (int i =0;i<arr.length -1;i++) {
      for (int j =0;j< arr.length-i-1;j++) {
        if (arr[j]> arr[j + 1]) {
          int temp= arr[j];
          arr[j]=arr[j + 1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("Bubble Sort : "+Arrays.toString(arr));
  }
  //merge Sort -------------
  public void mergeSort(int[] arr){
    if (arr.length <=1)
      return;
    mergeSortHelper(arr, 0, arr.length-1);
    System.out.println("Merge Sort : " + Arrays.toString(arr));
  }
  private void mergeSortHelper(int[] arr, int left, int right){
    if (left >= right)
      return;
    int mid = (left + right) / 2;
    mergeSortHelper(arr, left, mid);
    mergeSortHelper(arr, mid + 1, right);
    merge(arr, left, mid, right);
  }
  private void merge(int[] arr, int left, int mid, int right) {
    int[] temp =new int[right -left+1];
    int i =left,j=mid+1,k=0;
    while (i <=mid &&j<=right) {
      temp[k++] =(arr[i] <=arr[j]) ? arr[i++] : arr[j++];
    }
    while (i <=mid)
      temp[k++]= arr[i++];
    while (j <=right)
      temp[k++]=arr[j++];
    for (int p =0;p<temp.length; p++){
      arr[left+p]=temp[p];
    }
  }
  //quick Sort ----------
  public void quickSort(int[] arr) {
    quickSortHelper(arr, 0, arr.length - 1);
    System.out.println("Quick Sort    : "+ Arrays.toString(arr));
  }
  private void quickSortHelper(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      quickSortHelper(arr, low, pivot - 1);
      quickSortHelper(arr, pivot + 1, high);
    }
  }
  private int partition(int[] arr, int low, int high) {
    int pivot=arr[high];
    int i =low-1;
    for (int j =low;j<high;j++) {
      if (arr[j] <=pivot){
        i++;
        int temp=arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1]= arr[high];
    arr[high]=temp;
    return i+1;
  }
  public static void main(String[] args){
    int[] original={ 8, 2, 5, 4, 9, 3, 6,18, 20 };
    Sorting s =new Sorting();
    s.bubbleSort(original.clone());
    s.quickSort(original.clone());
    s.mergeSort(original.clone());
  }
}