import java.util.*;
public class SetToList{
    public static void main(String[] args){
        Set<Integer> set=new HashSet<>(Arrays.asList(5,7,8,1));
        // Convert set to list
        List<Integer> list =new ArrayList<>(set);
        // Sort the list
        Collections.sort(list);
        System.out.println(list);
    }
}
