public class StringConcatenation{
    public static void main(String[] args) {
        int n =100000;
        //using String
        long start =System.currentTimeMillis();
        String s="";
        for (int i=0;i<n;i++){
            s=s+"a";
        }
        long end =System.currentTimeMillis();
        System.out.println("String Time: "+ (end -start)+" ms");
        // Using StringBuilder
        start =System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i <n;i++) {
            sb.append("a");
        }
        end =System.currentTimeMillis();
        System.out.println("StringBuilder Time: "+(end -start)+ " ms");
        // Using StringBuffer
        start =System.currentTimeMillis();
        StringBuffer sf=new StringBuffer();
        for (int i=0;i<n;i++){
            sf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: "+(end-start)+ " ms");
    }
}
