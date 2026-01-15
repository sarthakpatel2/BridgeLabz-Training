import java.util.*;
public class BubbleSort{
    static void bubbleSort(int[] marks){
        int n=marks.length;
        boolean swap;
        //traverse through the array
        for (int i=0;i<n-1;i++){
            swap=false;
            //compare adjacent elements
            for (int j=0;j< n -i -1;j++){
                if (marks[j]>marks[j+1]) {
                    //swap
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]= temp;
                    swap=true;
                }
            }
            // If no swaps, array is already sorted
            if (!swap){
                break;
            }
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter student marks:");
        for (int i =0;i< n;i++){
            marks[i]=sc.nextInt();
        }
        bubbleSort(marks);
        System.out.println("Sorted Student Marks:");
        for (int mark :marks){
            System.out.print(mark+" ");
        }
    }
}
