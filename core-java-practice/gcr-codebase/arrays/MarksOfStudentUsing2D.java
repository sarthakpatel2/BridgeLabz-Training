import java.util.*;
public class MarksOfStudentUsing2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students ");
        int number= sc.nextInt();
        int[][] marks= new int[number][3];
        double percent[]= new double[number];
        char grade[] =new char[number];
        for (int i=0;i <number;i++){
            for (int j=0;j< 3;j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = sc.nextInt();
                if (mark < 0) {
                    System.out.println("invalid input");
                    j--;
                } else {
                    marks[i][j]= mark;
                }
            }
        }
        for (int i= 0;i<number;i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;
            double p=percent[i];
            if (p>=80)
                grade[i]= 'A';
            else if (p >=70)
                grade[i]= 'B';
            else if (p>= 60)
                grade[i]= 'C';
            else if (p >=50)
                grade[i]= 'D';
            else if (p >=40)
                grade[i]='E';
            else
                grade[i] ='R';
        }
        for (int i= 0; i< number;i++) {
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: "+ marks[i][1]);
            System.out.println("Maths: " +marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percent[i]);
            System.out.println("Grade: " +grade[i]);
        }
    }
}