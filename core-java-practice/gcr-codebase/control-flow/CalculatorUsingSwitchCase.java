import java.util.*;
public class CalculatorUsingSwitchCase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take the input of numbers
        double firstNumber=sc.nextDouble();
        double secondNumber=sc.nextDouble();
        String op=sc.next();
        //check for condition using switch
        switch (op){
            case "+":
                System.out.println(firstNumber+secondNumber);
                break;
            case "-":
                System.out.println(firstNumber-secondNumber);
                break;
            case "*":
                System.out.println(firstNumber*secondNumber);
                break;
            case "/":
                System.out.println(firstNumber/secondNumber);
                break;
                //if none of the above cases match
            default:
                System.out.println("Invalid Operator");
        }
    }
}