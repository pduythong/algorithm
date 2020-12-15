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
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 *
 * Constraints:
 *
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
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
