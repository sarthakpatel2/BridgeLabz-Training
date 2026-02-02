public class DynamicObject{
    public DynamicObject(){
        System.out.println("Object created");
    }
    public static void main(String[] args)throws Exception {
        Class<?> cls= Class.forName("DynamicObjectDemo");
        Object obj=cls.getDeclaredConstructor().newInstance();
        System.out.println("Class name: "+obj.getClass().getName());
    }
}
