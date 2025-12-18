import java.util.*;
class NumberOfHandshakes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // number of students
        int numberOfStudents=sc.nextInt();
        // number of handshakes
        int numberOfHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
        // output
        System.out.print(numberOfHandshakes);
    }
}