import java.util.*;
public class NthFromEnd{
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n =2;
        String result = findNthFromEnd(list, n);
        System.out.println(result);
    }
    public static <T> T findNthFromEnd(LinkedList<T> list, int n){
        Iterator<T> fast=list.iterator();
        Iterator<T> slow =list.iterator();
        // Move fast pointer n steps ahead
        for (int i =0;i<n;i++) {
            if (!fast.hasNext()) {
                return null; 
            }
            fast.next();
        }
        // Move both pointers together
        while (fast.hasNext()){
            fast.next();
            slow.next();
        }
        //slow now points to nth from end
        return slow.next();
    }
}
