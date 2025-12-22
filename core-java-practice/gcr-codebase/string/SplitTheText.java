import java.util.*;
public class SplitTheText{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        //find length without length()
        int len=0;
        try {
            while (true) text.charAt(len++);
        } catch (Exception e) {}
        //count words
        int word=1;
        for (int i=0;i<len;i++)
            if (text.charAt(i)==' ')word++;
        //split without biultin
        String[] manual= new String[word];
        int x= 0;
        String temp= "";

        for (int i =0;i< len;i++) {
            if (text.charAt(i)== ' ') {
                manual[x++]=temp;
                temp="";
            }else{
                temp+=text.charAt(i);
            }
        }
        manual[x]=temp;
        //built-in split
        String[] builtInSplit=text.split(" ");
        //compare string
        boolean same=manual.length==builtInSplit.length;
        for (int i=0;same&&i<manual.length;i++)
            if (!manual[i].equals(builtInSplit[i]))same= false;
        //output
        System.out.println("Same result? "+same);
    }
}
