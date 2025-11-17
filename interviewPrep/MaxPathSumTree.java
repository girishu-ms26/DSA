package interviewPrep;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxPathSumTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(maxPathSum(treeNode));
    }

    private static int maxPathSum(TreeNode treeNode) {
        int[] max = new int[1];
        max[0] = 0;
        maxSum(treeNode, max);
        return max[0];
    }

    private static int maxSum(TreeNode treeNode, int[] max) {
        if (treeNode == null) {
            return 0;
        }
        int left = Math.max(0, maxSum(treeNode.left, max));
        int right = Math.max(0, maxSum(treeNode.right, max));
        max[0] = Math.max(0, left + right + treeNode.val);
        return Math.max(left, right) + treeNode.val;
    }


}
