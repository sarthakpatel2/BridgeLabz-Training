public class LastWord{
    public int lengthOfLastWord(String s){
        s=s.trim();
        int lastSpace=s.lastIndexOf(' ');
        return (lastSpace == -1) ? s.length(): s.length()-lastSpace-1;
    }
    public static void main(String[] args){
        LastWord str= new LastWord();
        System.out.println(str.lengthOfLastWord("Hello World"));
    }
}
