package adityaverma;

import java.util.Stack;

public class SortAStack {
    public static void sortAStack(Stack<Integer> stack){
        if (stack.isEmpty())
            return;
        int lastElement = stack.pop();
        sortAStack(stack);
        insertInStack(stack,lastElement);
    }
    public static void insertInStack(Stack<Integer>stack,int val){
        if(stack.isEmpty() || stack.peek() >= val){
            stack.push(val);
            return;
        }
        int temp = stack.pop();
        insertInStack(stack,val);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        sortAStack(stack);
        System.out.println(stack);
    }

}

