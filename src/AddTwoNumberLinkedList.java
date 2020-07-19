/**
 * 2. Add Two Numbers
 * <p>
 * https://leetcode.com/problems/add-two-numbers/
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumberLinkedList {

    static public ListNode addTwoNode(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode prev = null;
        ListNode tmp = null;
        int carry = 0, sum;

        while (l1 != null || l2 != null) {

            sum = carry + (l1 != null ? l1.val : 0)
                    + (l2 != null ? l2.val : 0);

            carry = (sum > 9 ? 1 : 0);
            sum = sum % 10;

            tmp = new ListNode(sum);

            if (res == null)
                res = tmp;
            else
                prev.next = tmp;

            prev = tmp;

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;

        }

        if (carry > 0)
            tmp.next = new ListNode(carry);

        return res;
    }

}
