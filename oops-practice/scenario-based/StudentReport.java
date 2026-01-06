import java.util.*;
class Report{
  private String name;
  private int marks;
  Report(String name, int marks){
    this.name=name;
    this.marks=marks;
  }
  public String getName(){
    return name;
  }
  public int getMarks(){
    return marks;
  }
}
public class StudentReport{
  // move method inside the class
  public static void calculateScore(int[] marks, int total){
    String[] grades=new String[5];
    System.out.println("\nSubject Grades:- ");
    for (int i=0;i<marks.length;i++){
      if (marks[i]>90)
        grades[i]="A+";
      else if (marks[i]>80)
        grades[i]= "A";
      else if (marks[i]>70)
        grades[i]="B+";
      else if (marks[i]>60)
        grades[i] ="B";
      else if (marks[i]>50)
        grades[i]="C";
      else
        grades[i]="F";
      System.out.println("Subject "+(i+1)+" Score: "+marks[i]+" | Grade: "+grades[i]);
    }
    double average=(double) total/5;
    System.out.println("\nThe average of the student is:- "+average);
    double percentage=((double) total / 500) * 100;
    System.out.println("The percentage is:- "+percentage+"%");
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    List<Report>reportList=new ArrayList<>();
    int[] marksArray=new int[5];
    int total=0;
    //move input inside the loop to get 5 different subjects
    for (int i=0;i<5;i++) {
      System.out.print("Enter name for subject "+(i+1)+": ");
      String subject = sc.next();
      System.out.print("Enter marks for "+subject+": ");
      int m = sc.nextInt();
      // store in List and Array
      reportList.add(new Report(subject, m));
      marksArray[i] = m;
      total += m;
    }
    calculateScore(marksArray, total);
  }
}