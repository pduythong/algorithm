public class RemoveDupSortedLinkedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);

        System.out.println(removeDuplicate(node));
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }


    public static ListNode removeDuplicate(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = head, current = head;
        while (current != null) {
            while (current.next != null && current.next.val == prev.val) {
                current = current.next;
            }
            prev.next = current.next;
            prev = prev.next;
            current = current.next;
        }

        return head;
    }

}
