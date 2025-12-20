import java.util.*;
class CheckIfPersonCanVote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input from user
        int [] age=new int[10];
        for(int i=0;i<10;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]>18){
                System.out.print("The person's age is "+age+ " and can vote");
            }else{
                System.out.print("The person's age is "+age+ " and cannot vote");
            }
        }
    }
}