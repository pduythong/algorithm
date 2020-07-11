import java.util.ArrayList;
import java.util.List;

public class BoundaryOfTree {

    static List<Integer> boundaryOfTree(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        boundaryLeft(root, ans);
        leaves(root.left, ans);
        leaves(root.right, ans);
        boundaryRight(root.right, ans);
        return ans;
    }

    static void boundaryLeft(TreeNode node, List<Integer> ans) {
        if (node == null) return;
        if (node.left != null) {
            ans.add(node.val);
            boundaryLeft(node.left, ans);
        } else if (node.right != null) {
            ans.add(node.val);
            boundaryLeft(node.right, ans);
        }

    }

    static void leaves(TreeNode node, List<Integer> ans) {
        if (node == null) return;
        leaves(node.left, ans);
        if (node.left == null && node.right != null) {
            ans.add(node.val);
        }

        leaves((node.right), ans);

    }

    static void boundaryRight(TreeNode node, List<Integer> ans) {

        if (node == null) return;

        if (node.right != null) {
            ans.add(node.val);
            boundaryRight(node.right, ans);
        } else if (node.left != null) {
            ans.add(node.val);
            boundaryRight(node.right, ans);
        }
    }

}
