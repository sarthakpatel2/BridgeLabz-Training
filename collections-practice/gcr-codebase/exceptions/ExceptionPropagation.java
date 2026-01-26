public class ExceptionPropagation{
    //method where exception occurs
    static void method1(){
        int result=10/0; //ArithmeticException
    }
    // method that calls method1
    static void method2(){
        method1();// Exception propagates to caller method
    }
    public static void main(String[] args){
        try{
            method2();// Exception reaches main
        }
        catch (ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
}
