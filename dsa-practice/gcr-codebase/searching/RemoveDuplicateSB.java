import java.util.*;
public class RemoveDuplicateSB{
    public static void main(String[] args) {
        String input="programming";
        StringBuilder result=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for (char ch :input.toCharArray()){
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println("After removing duplicates: "+result);
    }
}
