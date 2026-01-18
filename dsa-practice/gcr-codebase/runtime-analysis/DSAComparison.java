import java.util.*;
public class DSAComparison{
    public static void main(String[] args){
        int n=1000000;
        int target =n-1;
        //array
        int[] array = new int[n];
        for (int i= 0;i<n;i++)
            array[i] = i;
        //hashSet
        HashSet<Integer> hashSet=new HashSet<>();
        // TreeSet
        TreeSet<Integer> treeSet=new TreeSet<>();
        for (int i =0;i< n;i++) {
            hashSet.add(i);
            treeSet.add(i);
        }
        //array search
        long start=System.currentTimeMillis();
        for (int value :array){
            if (value==target)
                break;
        }
        long end=System.currentTimeMillis();
        System.out.println("Array Search Time: "+ (end-start)+" ms");
        //HashSet search
        start =System.currentTimeMillis();
        hashSet.contains(target);
        end=System.currentTimeMillis();
        System.out.println("HashSet Search Time: "+(end-start)+" ms");
        //treeSet search
        start=System.currentTimeMillis();
        treeSet.contains(target);
        end=System.currentTimeMillis();
        System.out.println("TreeSet Search Time: "+(end -start)+" ms");
    }
}
