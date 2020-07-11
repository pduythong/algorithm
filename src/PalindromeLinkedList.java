import java.util.Stack;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode l) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = l;

        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        node = l;
        while (node != null) {
            if (stack.pop() != node.val) return false;
            node = node.next;
        }
        return true;
    }
}
