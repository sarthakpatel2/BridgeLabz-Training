import java.util.*;
public class VotingEligibility{
    //generates random 2-digit ages for n students
    static int[] generateAges(int n) {
        Random random= new Random();
        int[] age=new int[n];
        for (int i=0;i<n;i++) {
            age[i]=random.nextInt(90)+10;   // random 2-digit age 
        }
        return age;
    }
    // Determines voting eligibility based on age
    static String[][] checkEligibility(int[] age) {
        String[][] result=new String[age.length][2];
        for (int i =0;i< age.length;i++) {
            result[i][0] =String.valueOf(age[i]);
            if (age[i]< 0) {
                result[i][1]= "false";   // invalid age
            } else if (age[i]>= 18) {
                result[i][1]= "true";    // can vote
            } else {
                result[i][1]= "false";   // cannot vote
            }
        }
        return result;
    }
    //displays the 2D array in tabular format
    static void result(String[][] data){
        System.out.println("\nAge\tCan Vote");
        for (String[] rows: data) {
            System.out.println(rows[0]+"\t"+rows[1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count=sc.nextInt();
        //generate ages
        int[] age= generateAges(count);
        //check voting eligibility
        String[][] votingData=checkEligibility(age);
        //display result
        result(votingData);
    }
}
