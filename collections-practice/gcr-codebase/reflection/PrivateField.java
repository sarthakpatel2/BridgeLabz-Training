import java.lang.reflect.Field;
public class PrivateField{
    // private field
    private int age =20;
    public static void main(String[] args) throws Exception {
        PrivateField obj= new PrivateField();
        Class<?> cls= obj.getClass();
        Field field=cls.getDeclaredField("age");
        field.setAccessible(true);
        field.set(obj, 25);  //modify
        System.out.println("Age: " + field.get(obj));
    }
}
