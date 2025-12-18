import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //first number input
        float number1=sc.nextFloat();
        // second numberinput
        float number2=sc.nextFloat();
        // addition
        float addition=number1+number2;
        // subtraction
        float subtraction=number1-number2;
        // multiply
        float multiplication=number1*number2;
        // division
        float division=number1/number2;
        // output
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+", "+subtraction+", "+multiplication+" and "+division);

    }
}