import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
public class ClassInfoDemo {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter class name : ");
        String className=sc.nextLine();
        //load class
        Class<?> cls=Class.forName(className);
        System.out.println("\nFields ---");
        for (Field f:cls.getDeclaredFields()){
            System.out.println(f.getName());
        }
        System.out.println("\nMethods ---");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
        System.out.println("\nConstructors ---");
        for (Constructor<?> c : cls.getDeclaredConstructors()) {
            System.out.println(c.getName());
        }
    }
}
