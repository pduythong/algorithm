public class StackLinkedList {

    public static void main(String[] args) {
        StackLinkedList stackTest = new StackLinkedList();
        stackTest.push(1);
        stackTest.push(2);
        stackTest.push(3);
        stackTest.push(4);

        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());

    }
    static class LinkedNode {

        int val;
        LinkedNode next;

        public LinkedNode(int val) {
            this.val = val;
        }

        public LinkedNode(){}

    }
    LinkedNode top;


    public StackLinkedList(){
        this.top = null;
    }


    public void push(int val){
        LinkedNode tmp = new LinkedNode();
        tmp.val = val;
        tmp.next = top;
        top= tmp;

    }

    public int pop(){
        if(top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int val = top.val;
        top = top.next;
        return val;
    }

    public boolean isEmpty(){
        return top == null;
    }

}
