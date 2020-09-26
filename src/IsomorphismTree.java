public class IsomorphismTree {


    boolean isomorphism(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2 == null) return true;

        if (node1 == null || node2 == null) return false;

        if (node1.val != node2.val) return false;


        return (isomorphism(node1.left, node2.left) && isomorphism(node1.right, node2.right)
                || isomorphism(node1.left, node2.right) && isomorphism(node1.right, node2.left));
    }
}
