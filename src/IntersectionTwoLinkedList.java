public class IntersectionTwoLinkedList {

    public static ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        ListNode head1 = l1, head2 = l2;
        int len1 = 0, len2 = 0;

        while (head1 != null) {
            head1 = head1.next;
            len1++;
        }

        while (head2 != null) {
            head2 = head2.next;
            len2++;
        }

        head1 = l1;
        head2 = l2;

        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                head1 = head1.next;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                head2 = head2.next;
            }

        }
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;

    }
}
