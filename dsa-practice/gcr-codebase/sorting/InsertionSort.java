import java.util.*;
public class InsertionSort{
    static void insertionSort(int[] empIds){
        int n=empIds.length;
        //start from second element as first is sorted
        for (int i=1;i<n;i++){
            int key=empIds[i];
            int j=i-1;
            //shift elements of sorted part
            while (j >=0 &&empIds[j]>key){
                empIds[j+1]=empIds[j];
                j--;
            }
            //insert key at correct position
            empIds[j +1]=key;
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n =sc.nextInt();
        int[] empIds =new int[n];
        System.out.println("Enter employee IDs:");
        for (int i =0;i< n;i++){
            empIds[i]=sc.nextInt();
        }
        insertionSort(empIds);
        System.out.println("Sorted Employee IDs:");
        for (int id :empIds) {
            System.out.print(id+" ");
        }
    }
}
