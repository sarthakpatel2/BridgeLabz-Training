import java.util.*;
public class BinaryNumber{
    static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i =0;i<n; i++) {
            String curr = q.remove();
            result.add(curr);
            q.add(curr +"0");
            q.add(curr+"1");
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(generateBinary(5));
    }
}
