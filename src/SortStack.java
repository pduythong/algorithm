import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(9);
        stack.push(3);

        stack = sortStack(stack);

        System.out.println(stack);

    }

    public static Stack<Integer> sortStack(Stack<Integer> s) {
        Stack<Integer> stack = new Stack<>();

        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!stack.isEmpty() && stack.peek() > tmp) {
                s.push(stack.pop());

            }
            stack.push(tmp);
        }
        return stack;
    }
}
