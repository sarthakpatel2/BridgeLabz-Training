import java.util.*;
public class Reverse{
    // Reverse ArrayList
    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i =list.size() -1;i >=0;i--) {
            result.add(list.get(i));
        }
        return result;
    }
    // Reverse LinkedList
    public static <T> List<T> reverseLinkedList(List<T> list) {
        List<T> result = new LinkedList<>();
        ListIterator<T> it=list.listIterator(list.size());
        while (it.hasPrevious()) {
            result.add(it.previous());
        }
        return result;
    }
}
