import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class StudentData{
    public static void main(String[] args){
        String fileName ="collections-practice/gcr-codebase/java-streams/student.txt";
        // Writing student data
        try (
            DataOutputStream dos=new DataOutputStream(new FileOutputStream(fileName))
        ) {
            dos.writeInt(1593); 
            dos.writeUTF("Sarthak"); 
            dos.writeDouble(8.00); 
            System.out.println("Student data written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Reading student data
        try (
            DataInputStream dis=new DataInputStream(new FileInputStream(fileName))
        ){
            int rollNo =dis.readInt();
            String name =dis.readUTF();
            double gpa =dis.readDouble();
            System.out.println("\nRetrieved Student Details:");
            System.out.println("Roll No: " +rollNo);
            System.out.println("Name: "+ name);
            System.out.println("GPA: "+gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
