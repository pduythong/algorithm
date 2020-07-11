/*
uestion:

      1
     /\
    2  3
   /\  / \
  4  5 6  7

find weight of all elements such that weight =sum of(product of all the traversal path through node)

for ex consider 2
find all path traversing through 2
{1,2,4} and {1,2,5}
now weight of 2 is
(1*2*4) +(1*2*5)
8+10
18
weight(3)

(1*3*6) + (1*3*7)
18+21=39
 */
public class FindWeight {

    static int weight = 0;

    public static int findWeight(TreeNode root, TreeNode node) {
        dfs(root, node, 1, false);
        return weight;
    }

    private static void dfs(TreeNode root, TreeNode node, int currentWeight, boolean through) {
        if (node == null) {
            if (through) {
                weight += currentWeight / 2;
            }
            return;
        }

        currentWeight *= node.val;
        if (root == node) {
            through = true;
        }

        dfs(root.left, node, currentWeight, through);
        dfs(root.right, node, currentWeight, through);

    }

}
