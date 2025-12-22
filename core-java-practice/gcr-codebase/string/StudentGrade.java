import java.util.*;
public class StudentGrade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking subject marks from the student
        System.out.print("Enter marks obtained in Physics ");
        int physicsMark= sc.nextInt();
        System.out.print("Enter marks obtained in Chemistry ");
        int chemistryMark =sc.nextInt();
        System.out.print("Enter marks obtained in Mathematics ");
        int mathsMark= sc.nextInt();
        // Calculate total marks
        int totalMark= physicsMark+chemistryMark+ mathsMark;
        // Calculate percentage
        double percent=totalMark/3.0;
        String finalGrade;
        //decide grade based on percentage
        if(percent>= 80) {
            finalGrade = "A";
        }
        else if(percent>=70) {
            finalGrade="B";
        }
        else if(percent>=60) {
            finalGrade= "C";
        }
        else if(percent>=50) {
            finalGrade ="D";
        }
        else if(percent>=40) {
            finalGrade ="E";
        }
        else{
            finalGrade="R";
        }
        //display the final result
        System.out.println("Total Marks : " + totalMark);
        System.out.println("Percentage : " + String.format("%.2f",percent)+"%");
        System.out.println("Grade : " + finalGrade);
    }
}
