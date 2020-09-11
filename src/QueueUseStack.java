import java.util.Stack;

public class QueueUseStack {

    Stack<Integer> s1, s2;
    int size = 0;
    public QueueUseStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void add(int x) {
        s1.push(x);
        size++;
    }

    public int remove() {
        if (size == 0) return -1;

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        size--;
        return s2.pop();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        System.out.println(digitsManipulations(123456));
    }

    static  public int digitsManipulations(int n) {

        String digits = String.valueOf(n);
        int ans = 1;

        for ( char c: digits.toCharArray()
             ) {

            int num = Integer.parseInt(String.valueOf(c));
            ans *= num;

        }

        return  ans;
    }


}
