import java.util.*;
public class VoteChecker{
    public boolean canVote(int age){
        //check for legal age to vote
        if (age<0){
        	return false;
        }
        if(age>=18) {
        	return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VoteChecker checker=new VoteChecker();
        int age[]=new int[10];
        for (int i=0;i<10;i++){//take input of age
            System.out.print("Enter age of student "+(i+1));
            age[i]=sc.nextInt();
            boolean canVote=checker.canVote(age[i]);
            //check and display result whether student can vote or not
            if (canVote){
            	System.out.println("Student can vote");
            }
            else {
            	System.out.println("Student cannot vote");
            }
        }
    }
}
