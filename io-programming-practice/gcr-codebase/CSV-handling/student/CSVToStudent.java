import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CSVToStudent{
    //student class
    static class Student{
        int id;
        String name;
        int age;
        int marks;
        public Student(int id, String name, int age, int marks){
            this.id =id;
            this.name=name;
            this.age=age;
            this.marks=marks;
        }
        @Override
        public String toString(){return "Student [ID="+id+", Name="+name+", Age="+age+", Marks="+marks+"]";
        }
    }
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        String filePath="io-programming-practice/gcr-codebase/CSV-handling/students.csv";
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            //skip header
            br.readLine();
            //read each row and convert to student object
            while ((line=br.readLine()) != null){
                String[] data=line.split(",");
                Student student=new Student(
                    Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3]));
                students.add(student);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        //print all students
        for (Student s: students){
            System.out.println(s);
        }
    }
}
