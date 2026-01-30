public class CensorBadWords{
    public static void main(String[] args){
        String input="This is a damn bad example with some stupid words.";
        //list of bad words
        String[] badWords={"damn", "stupid"};
        // make a regex pattern of \b(word1|word2|word3)\b
        String regex ="\\b("+String.join("|",badWords)+")\\b";
        //replace bad words with ****
        String censoredText=input.replaceAll(regex, "****");
        System.out.println("Original Sentence:");
        System.out.println(input);
        System.out.println("\nCensored Sentence:");
        System.out.println(censoredText);
    }
}
