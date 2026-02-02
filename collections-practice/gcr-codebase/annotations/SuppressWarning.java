import java.util.ArrayList;
public class SuppressWarning{
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList list=new ArrayList(); // no generics
        list.add("Maths");
        list.add(100);   // mixed types
        System.out.println(list);
    }
}
