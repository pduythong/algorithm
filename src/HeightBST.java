public class HeightBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(4);
//
//        root.right = new TreeNode(6);
//        root.right.left = new TreeNode(7);
//        root.right.right = new TreeNode(8);
//        root.right.left.left = new TreeNode(9);


        System.out.println(height(root));
    }

    static public int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        int lH = height(root.left);
        int rH = height(root.right);
        return Math.max(lH, rH) + 1;
    }


}
