import java.util.*;
//node class
class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;
    Student(int rollNo, String name, int age, char grade){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.grade= grade;
        this.next=null;
    }
}
//linked list class
class StudentLinkedList{
    Student head;
    // add at beginning
    void addAtBeginning(int rollNo,String name, int age,char grade){
        Student newStudent =new Student(rollNo,name,age,grade);
        newStudent.next=head;
        head=newStudent;
        System.out.println("Student added at beginning");
    }
    //add at end
    void addAtEnd(int rollNo, String name,int age,char grade){
        Student newStudent=new Student(rollNo,name, age,grade);
        if (head==null){
            head= newStudent;
            return;
        }
        Student temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newStudent;
        System.out.println("Student added at end");
    }
    //add student at specific position
    void addAtPosition(int position,int rollNo,String name,int age,char grade){
        if (position<=0){
            addAtBeginning(rollNo,name,age,grade);
            return;
        }
        Student newStudent = new Student(rollNo,name,age,grade);
        Student temp =head;
        for (int i=1;i<position &&temp!=null;i++){
            temp =temp.next;
        }
        if (temp==null){
            System.out.println("Invalid position");
            return;
        }
        newStudent.next=temp.next;
        temp.next=newStudent;
        System.out.println("Student added at position "+position);
    }
    //delete by roll number
    void deleteByRollNo(int rollNo){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if (head.rollNo==rollNo){
            head=head.next;
            System.out.println("Student deleted");
            return;
        }
        Student temp=head;
        while (temp.next!=null&& temp.next.rollNo!=rollNo){
            temp=temp.next;
        }
        if (temp.next==null) {
            System.out.println("Student not found");
        } else {
            temp.next=temp.next.next;
            System.out.println("Student deleted");
        }
    }
    // search by roll number
    void search(int rollNo){
        Student temp=head;
        while (temp!=null){
            if (temp.rollNo==rollNo){
                System.out.println("Student Found:");
                System.out.println("Roll No: "+temp.rollNo);
                System.out.println("Name: "+temp.name);
                System.out.println("Age: "+temp.age);
                System.out.println("Grade: "+temp.grade);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }
    //update grade
    void updateGrade(int rollNo,char newGrade){
        Student temp=head;
        while (temp!=null){
            if (temp.rollNo==rollNo){
                temp.grade=newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }
    //display all student
    void display(){
        if (head==null){
            System.out.println("No student record available");
            return;
        }
        Student temp=head;
        System.out.println("\nStudent Records:");
        while (temp!=null){
            System.out.println("Roll No: "+temp.rollNo+", Name: "+temp.name+", Age: "+temp.age+", Grade: "+temp.grade);
            temp=temp.next;
        }
    }
}
//main class
public class StudentManagementSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentLinkedList list=new StudentLinkedList();
        while (true){
            System.out.println("\nStudent Record Management :---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                case 2:
                case 3:
                    System.out.print("Roll No: ");
                    int roll=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name=sc.nextLine();
                    System.out.print("Age: ");
                    int age=sc.nextInt();
                    System.out.print("Grade: ");
                    char grade=sc.next().charAt(0);
                    if (choice==1)
                        list.addAtBeginning(roll,name,age,grade);
                    else if (choice ==2)
                        list.addAtEnd(roll, name, age, grade);
                    else{
                        System.out.print("Position: ");
                        int pos=sc.nextInt();
                        list.addAtPosition(pos, roll,name,age, grade);
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    list.deleteByRollNo(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Roll No to search: ");
                    list.search(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter Roll No: ");
                    int r=sc.nextInt();
                    System.out.print("Enter New Grade: ");
                    char g=sc.next().charAt(0);
                    list.updateGrade(r,g);
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.println("Exiting program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}