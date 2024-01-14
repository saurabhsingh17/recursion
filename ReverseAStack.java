import java.util.Stack;

public class ReverseAStack {
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int val = stack.pop();
        reverse(stack);
        insert(stack,val);

    }
    public static void insert(Stack<Integer> stack, int val){
        if (stack.isEmpty()){
            stack.push(val);
            return;
        }
        int temp = stack.pop();
        insert(stack,val);
        stack.push(temp);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        //stack.push(8);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
