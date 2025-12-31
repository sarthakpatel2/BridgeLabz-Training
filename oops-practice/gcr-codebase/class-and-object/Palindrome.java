class Palindrome{
    String text;
    boolean isPalindrome() {
        String cleanText=text.replaceAll("\\s+", "").toLowerCase();
        String reverse="";
        for (int i=cleanText.length()-1;i>= 0;i--) {
            reverse+=cleanText.charAt(i);
        }
        return cleanText.equals(reverse);
    }
    void displayResult() {
        if (isPalindrome())
            System.out.println(text+" is palindrome");
        else
            System.out.println(text+" is not Palindrome");
    }
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome();
        p1.text = "A man a plan a canal Panama";
        Palindrome p2 = new Palindrome();
        p2.text = "Hello";
        p1.displayResult();
        p2.displayResult();
    }
}
