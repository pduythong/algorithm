import java.util.LinkedList;
import java.util.Queue;

public class StackUseQueue {
    Queue<Integer> q1, q2;
    int size = 0;

    StackUseQueue() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int val) {
        q2.add(val);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        size++;
    }

    public int top() {
        if (q1.isEmpty()) return -1;
        return q1.peek();
    }

    public int size() {
        return this.size;
    }

    public int pop() {
        if (size == 0) return -1;

        size--;
        return q1.poll();

    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
