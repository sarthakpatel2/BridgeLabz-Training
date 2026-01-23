public class EduResult{
    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left <right) {
            int mid=(left +right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr,mid+1,right);
            merge(arr, left, mid, right);
        }
    }
    //merge two sorted halves
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 =mid-left+1;
        int n2 =right -mid;
        int[] L =new int[n1];
        int[] R=new int[n2];
        for (int i =0;i< n1;i++)
            L[i]=arr[left+ i];
        for (int j=0;j<n2;j++)
            R[j]=arr[mid+1+j];
        int i = 0, j =0, k=left;
        while (i <n1&& j <n2) {
            if (L[i] <= R[j]) {
                arr[k++]= L[i++];
            } else{
                arr[k++] = R[j++];
            }
        }
        while (i< n1)
            arr[k++] =L[i++];
        while (j <n2)
            arr[k++] =R[j++];
    }
    public static void main(String[] args){
        // sorted marks
        int[] district1 = {55,70,85};
        int[] district2 = {60,75,90};
        int[] district3 = {50,80,95};
        // Merge all districts
        int[] allMarks =new int[district1.length+district2.length +district3.length];
        int index =0;
        for (int x :district1) allMarks[index++] =x;
        for (int x : district2) allMarks[index++]=x;
        for (int x : district3) allMarks[index++]=x;
        mergeSort(allMarks, 0, allMarks.length -1);
        System.out.println("Final State-wise Rank List:");
        for (int mark : allMarks){
            System.out.print(mark + " ");
        }
    }
}
