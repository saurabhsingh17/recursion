import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public static void delete(Stack<Integer> stack, int k){
        if(k == 1) {
            stack.pop();
            return;
        }
        int val = stack.pop();
        delete(stack, k-1);
        stack.push(val);

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

        delete(stack,(stack.size()/2)+1);
        System.out.println(stack);
    }
}
