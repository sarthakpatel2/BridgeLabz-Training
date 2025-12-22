public class NullPointerException{
    //method to generate Exception
    static void exception(){
        String string=null;//text initialized to null
        System.out.println(string.length());//calling string method
    }
    // Method to handle NullPointerException
    static void handleException() {
        //text initialized to null
        String string=null;         
        try{
            System.out.println(string.length());
        } catch(Exception e){
            System.out.println("NullPointerException caught and handled");
        }
    }
    public static void main(String[] args){
        //calling method that generates exception
        System.out.println("Generating NullPointerException");
        exception();
        //refactored code to handle exception
        System.out.println("\nHandling NullPointerException");
        handleException();
    }
}
