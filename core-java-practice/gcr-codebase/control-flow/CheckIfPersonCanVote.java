import java.util.*;
class CheckIfPersonCanVote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // input age
        System.out.print("Enter your ages:");
        int age=sc.nextInt();
        // check voting eligibility
        if(age>=18){
            System.out.println("The person's age is "+age+" and can vote");
        }
        else{
            System.out.println("The person's age is "+age+" and cannot vote");
        }
    }
}