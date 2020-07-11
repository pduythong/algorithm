public class DiameterOfBinaryTree {
    static int ans = 1;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(5);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
//        root.right.left.left = new TreeNode(9);


        System.out.println(diameterOfBinaryTree(root));
    }
//    int ans = 1;

    static public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        height(root);
        return ans - 1;
    }

    static private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
