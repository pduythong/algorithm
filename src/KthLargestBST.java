import java.util.Stack;

public class KthLargestBST {

//    static int ret = 0;
    private static int count = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(10);

        System.out.println(kthLargestStack(root, 2));
        System.out.println(kthLargestRec(root, 2));
    }

    public static int kthLargestRec(TreeNode root, int k) {

        if (root == null) return Integer.MAX_VALUE;

        int val = kthLargestRec(root.right, k);
        if (val != Integer.MAX_VALUE) return val;

        if (++count == k) return root.val;
        return kthLargestRec(root.left, k);

    }

    public static int kthLargestStack(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.right;
            }

            TreeNode node = stack.pop();
            if (--k == 0) return node.val;
            current = node.left;

        }
        return -1;
    }
}
