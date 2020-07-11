import java.util.ArrayList;
import java.util.List;

public class KthDistanceFromRoot {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(8);
        printNode(root, 2).forEach(System.out::println);

    }


    public static List<List<Integer>> printNode(TreeNode root, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, k, ans);
        return ans;

    }

    private static void helper(TreeNode node, int level, List<List<Integer>> ans) {
        if (node == null) return;

        if(level == 0){
            if(ans.isEmpty()) ans.add(new ArrayList<>());
            ans.get(level).add(node.val);
        }

        helper(node.left, level - 1, ans);
        helper(node.right, level - 1, ans);

    }

}
