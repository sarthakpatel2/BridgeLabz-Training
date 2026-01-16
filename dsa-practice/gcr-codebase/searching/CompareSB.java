public class CompareSB{
    public static void main(String[] args){
        int n = 1_000_000;
        // StringBuilder
        long startSB=System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++){
            sb.append("hello");
        }
        long endSB=System.nanoTime();
        // StringBuffer
        long startSBF=System.nanoTime();
        StringBuffer sbf =new StringBuffer();
        for (int i=0;i< n;i++){
            sbf.append("hello");
        }
        long endSBF=System.nanoTime();
        System.out.println("StringBuilder Time: "+(endSB-startSB) );
        System.out.println("StringBuffer Time: "+(endSBF -startSBF));
    }
}
