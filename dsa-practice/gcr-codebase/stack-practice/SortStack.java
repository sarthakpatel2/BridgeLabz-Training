import java.util.*;
public class SortStack{
    //function to sort the stack
    public static void sortStack(Stack<Integer> stack){
        if (!stack.isEmpty()){
            int top=stack.pop();
            sortStack(stack);
            insertSort(stack, top);
        }
    }
    //function to insert an element in sorted order
    private static void insertSort(Stack<Integer> stack,int element){
        if (stack.isEmpty() ||stack.peek()<=element){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        insertSort(stack, element);
        stack.push(top);
    }
    //driver code
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(30);
        stack.push(40);
        stack.push(20);
        stack.push(50);
        System.out.println("Original Stack: "+stack);
        sortStack(stack);
        System.out.println("Sorted Stack: "+stack);
    }
}
