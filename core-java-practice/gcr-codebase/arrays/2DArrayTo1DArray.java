import java.util.*;
class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Take input for rows and columns
        System.out.print("Enter number of rows");
        int row= sc.nextInt();
        System.out.print("Enter number of columns");
        int col= sc.nextInt();
        //create 2D array 
        int[][] matrix=new int[row][col];
        // input for matrix
        System.out.println("Enter elements of matrix");
        for (int i =0;i<row;i++) {
            for (int j=0; j< col;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        //create 1D array of size rows*columns
        int[] array=new int[row*col];
        int index=0;
        //copy elements from 2D array to 1D array
        for (int i =0;i <row;i++) {
            for (int j= 0;j <col;j++) {
                array[index]= matrix[i][j];
                index++;
            }
        }
        //display 1D array
        System.out.println("Elements copied into 1D array");
        for (int i =0;i <array.length;i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
