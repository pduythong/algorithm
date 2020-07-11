import java.util.Stack;

public class SortStack {

    Stack<Integer> sortStack(Stack<Integer> s) {
        Stack<Integer> stack = new Stack<>();

        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!stack.isEmpty() && s.peek() > tmp) {
                s.push(stack.pop());

            }
            stack.push(tmp);
        }
        return stack;
    }
}
