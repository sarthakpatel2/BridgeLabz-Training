import java.util.*;
public class RotateList{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int k =2;
        List<Integer> rotatedList = rotateList(list, k);
        System.out.println(rotatedList);
    }
    public static <T> List<T> rotateList(List<T> list, int k) {
        int n=list.size();
        k =k%n;   // handle large k
        List<T> result= new ArrayList<>();
        // add elements from k to end
        for (int i =k;i<n;i++) {
            result.add(list.get(i));
        }
        // add first k elements
        for (int i=0;i<k;i++) {
            result.add(list.get(i));
        }
        return result;
    }
}
