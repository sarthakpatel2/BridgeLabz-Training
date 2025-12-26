import java.util.*;
public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // generate PCM scores
        int[][] pcmMarks = generatePCMScore(n);
        // Calculate total, average, percentage
        double[][] results = calculateResults(pcmMarks);
        // display scorecard
        displayScore(pcmMarks, results);
        sc.close();
    }
    //generate random 2-digit PCM scores
    public static int[][] generatePCMScore(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = (int) (Math.random() * 100); // Physics
            marks[i][1] = (int) (Math.random() * 100); // Chemistry
            marks[i][2] = (int) (Math.random() * 100); // Maths
        }
        return marks;
    }
    // calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;
            // round off to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // display scorecard
    public static void displayScore(int[][] marks, double[][] result) {
        System.out.println("\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            String grade = getGrade(result[i][2]);
            System.out.printf(
                    "%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    grade
            );
        }
    }
    // Grade calculation
    public static String getGrade(double percentage) {

        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }
}
