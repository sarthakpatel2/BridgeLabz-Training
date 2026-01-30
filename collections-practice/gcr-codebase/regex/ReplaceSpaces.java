public class ReplaceSpaces{
    public static void main(String[] args){
        String input ="This   is   an   example   with    multiple   spaces.";
        // Replace multiple spaces with single space
        String result=input.replaceAll("\\s+", " ");
        System.out.println("Original String:");
        System.out.println(input);
        System.out.println("\nAfter Replacement:");
        System.out.println(result);
    }
}
