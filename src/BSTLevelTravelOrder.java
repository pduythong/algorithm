import java.util.ArrayList;
import java.util.List;

public class BSTLevelTravelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(8);
        levelOrder(root).forEach(System.out::println);

    }

    static void helper(TreeNode node, int level, List<List<Integer>> ans) {
        if (node == null) return;
        if (level == ans.size()) {
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(node.val);
        helper(node.left, level + 1, ans);
        helper(node.right, level + 1, ans);

    }

    static public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;

    }

}
