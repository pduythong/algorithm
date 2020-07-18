public class RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode current = head;
        ListNode ret = current;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        length = length - n;
        current = head;

        while (length-- > 0) {
            current = current.next;
        }
        current.next = current.next.next;

        return ret.next;

    }

}
