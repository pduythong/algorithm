public class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head, tail;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node node = getNodeAtIndex(index);
        return node == null ? -1 : node.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    private Node getNodeAtIndex(int index) {
        if (index < 0 || index >= size || head == null) return null;
        Node node = head;
        while (index-- > 0) {
            node = node.next;
        }
        return node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size) return;
        if (index == 0) {
            addAtHead(val);
        } else if (index == this.size) {
            addAtTail(val);
        } else {
            Node prev = getNodeAtIndex(index - 1);
            Node node = new Node(val);
            node.next = prev.next;
            prev.next = node;
            this.size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) return;
        if (index == 0) {
            if (this.size == 1) {
                this.head = null;
                this.tail = null;
            } else {
                Node node = this.head;
                Node temp = node.next;
                node.next = null;
                this.head = temp;
            }
        } else if (index == this.size - 1) {
            if (this.size == 1) {
                this.head = null;
                this.tail = null;
            } else {
                Node secondLast = getNodeAtIndex(this.size - 2);
                secondLast.next = null;
                this.tail = secondLast;
            }
        } else {
            Node prev = getNodeAtIndex(index - 1);
            Node current = prev.next;
            Node forward = prev.next.next;
            prev.next = forward;
            current.next = null;
        }
        size--;
    }
}
