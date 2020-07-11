import java.util.Stack;

public class QueueUseStack {
    Stack<Integer> s1, s2;
    int size = 0;

    public QueueUseStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void add(int x) {
        if (s1.isEmpty()) {
            s1.push(x);

        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        size++;
    }

    public int remove() {
        if (size == 0) return -1;
        size--;
        return s1.pop();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }


}
