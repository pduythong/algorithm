import java.util.LinkedList;
import java.util.Queue;

public class StackUseQueue<T> {
    public static void main(String[] args) {
        StackUseQueue<Integer> stack = new StackUseQueue<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(44);
        stack.push(5);

    }

    Queue<T> q1, q2;
    int size = 0;

    StackUseQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(T val) {
        q2.add(val);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<T> q = q1;
        q1 = q2;
        q2 = q;
        size++;
    }

    public T pop() {
        if (size == 0) return null;

        size--;
        return q1.poll();

    }

    public T top() {
        if (!q1.isEmpty()) {
            return q1.peek();
        }
        return  null;
    }

    public int size() {
        return this.size;
    }



    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
