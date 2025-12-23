import java.util.*;
public class BMI{
    public static int calculateBmi(int[]data){
        try{
        return data[1]/(data[0]*data[0]);
        }
        catch(ArithmeticException e){
            return -1;
        }
    }
    public static int[][] fillData(int[][] bmi){
        int [][] calculate=new int[10][3];
        for(int i=0;i<10;i++){
            calculate[i][0]=bmi[i][0];
            calculate[i][1]=bmi[i][1];
            calculate[i][2]=calculateBmi(bmi[i]);
        }
        return calculate;
    }
    public static void displayResult(int [][] fullData){
        System.out.println("Student\theight\tweight\tBMI");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+"\t"+fullData[i][0]+"\t"+fullData[i][1]+"\t"+fullData[i][2]);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int studentData[][]=new int[10][2];
        for(int i=0;i<10;i++){
            System.out.println("Enter the height of "+(i+1)+" person ");
            studentData[i][0]=(int)(Math.random()*10);
             System.out.println("Enter the weight of "+(i+1)+" person ");
            studentData[i][1]=(int)(Math.random()*100);
        }
        int[][]finalList=fillData(studentData);
        displayResult(finalList);
    }

}