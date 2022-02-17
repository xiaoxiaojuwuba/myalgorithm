package myalgorithm;

import java.util.Arrays;

public class RebuildBinaryTree {
    /* JZ7 重建二叉树 */
    // 给定节点数为 n 的二叉树的前序遍历和中序遍历结果，请重建出该二叉树并返回它的头结点。
    // 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建出如下图所示。

    // 提示:
    // 1.vin.length == pre.length
    // 2.pre 和 vin 均无重复元素
    // 3.vin出现的元素均出现在 pre里
    // 4.只需要返回根结点，系统会自动输出整颗树做答案对比
    // 数据范围：n≤2000n \le 2000n≤2000，节点的值 −10000≤val≤10000-10000 \le val \le
    // 10000−10000≤val≤10000
    // 要求：空间复杂度 O(n)O(n)O(n)，时间复杂度 O(n)O(n)O(n)

    // 示例1
    // 输入：
    //
    // [1,2,4,7,3,5,6,8],[4,7,2,1,5,3,8,6]
    //
    // 返回值：
    //
    // {1,2,3,4,#,5,6,#,7,#,#,8}
    //
    // 说明：
    //
    // 返回根节点，系统会输出整颗二叉树对比结果，重建结果如题面图示
    //
    // 示例2
    // 输入：
    //
    // [1],[1]
    //
    // 返回值：
    //
    // {1}
    //
    // 示例3
    // 输入：
    //
    // [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
    //
    // 返回值：
    //
    // {1,2,5,3,4,6,7}

    // Definition for binary tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    // [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
    //
    // 返回值：
    //
    // {1,2,5,3,4,6,7}
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (pre[0] == in[i]) {
                treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),
                        Arrays.copyOfRange(in, i + 1, in.length));
            }
        }

        return treeNode;
    }
}
