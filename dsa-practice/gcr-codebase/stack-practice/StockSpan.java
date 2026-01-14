import java.util.*;
public class StockSpan{
    public static int[] calculateSpan(int[] prices){
        int n=prices.length;
        int[] span=new int[n];
        Stack<Integer> stack =new Stack<>();
        //first day span is 1
        span[0] =1;
        stack.push(0);
        for (int i=1;i<n;i++) {
            //pop while current price is greater or equal to stack top
            while (!stack.isEmpty() && prices[i] >=prices[stack.peek()]){
                stack.pop();
            }
            //if stack is empty then span is i+1
            span[i] =stack.isEmpty()?(i+1):(i-stack.peek());
            // push current index
            stack.push(i);
        }
        return span;
    }
    public static void main(String[] args){
        int [] prices={100,40,30,50,70,10};
        int[] span=calculateSpan(prices);
        System.out.println("Stock Spans:- ");
        for (int s:span) {
            System.out.print(s+" ");
        }
    }
}
