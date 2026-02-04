import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Marker interfaceMerializable is already provided by Java
class UserData implements Serializable{
    int userId;
    String name;
    UserData(int userId, String name){
        this.userId=userId;
        this.name=name;
    }
}
public class BackupSerialization{
    public static void main(String[] args){
        UserData user=new UserData(101, "Sarthak");
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("backup.dat"));
            out.writeObject(user);
            out.close();
            System.out.println("User data backed up successfully");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
