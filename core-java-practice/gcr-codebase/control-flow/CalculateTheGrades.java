import java.util.*;
class CalculateTheGrades{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        int Maths=sc.nextInt();
        int Physics=sc.nextInt();
        int Chemistry=sc.nextInt();
        //calculate percentage
        int average=(Maths+Physics+Chemistry)/3;
        char grade;
        String remarks;
        // Grade calculation
        if (average>=80) {
            grade ='A';
            remarks="Level 4, above agency-normalized standards";
        } else if (average>= 70) {
            grade = 'B';
            remarks ="Level 3, at agency-normalized standards";
        } else if (average>= 60) {
            grade= 'C';
            remarks ="Level 2, below but approaching agency-normalized standards";
        } else if (average>= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >=40) {
            grade ='E';
            remarks= "Level 1-, too below agency-normalized standards";
        } else {
            grade= 'R';
            remarks="Remedial standards";
        }
        //result
        System.out.println("Average Marks: " +average);
        System.out.println("Grade: " +grade);
        System.out.println("Remarks: " +remarks);
    }
}