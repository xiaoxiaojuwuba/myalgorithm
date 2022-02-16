package myalgorithm;

public class ArrayFind {

    /* JZ4 二维数组中的查找 */
    // 描述
    // 在一个二维数组array中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    // [
    // [1,2,8,9],
    // [2,4,9,12],
    // [4,7,10,13],
    // [6,8,11,15]
    // ]
    //
    // 给定 target = 7，返回 true。
    // 给定 target = 3，返回 false。
    //
    // 数据范围：矩阵的长宽满足 0≤n,m≤5000 \le n,m \le 5000≤n,m≤500 ， 矩阵中的值满足 0≤val≤1090 \le
    // val \le 10^90≤val≤109
    // 进阶：空间复杂度 O(1)O(1)O(1) ，时间复杂度 O(n+m)O(n+m)O(n+m)

    // 示例1
    // 输入：
    //
    // 7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
    //
    // 返回值：
    //
    // true
    //
    // 说明：
    //
    // 存在7，返回true
    //
    // 示例2
    // 输入：
    //
    // 1,[[2]]
    //
    // 返回值：
    //
    // false
    //
    // 示例3
    // 输入：
    //
    // 3,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
    //
    // 返回值：
    //
    // false
    //
    // 说明：
    //
    // 不存在3，返回false
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean Find(int target, int[][] array) {
        int row = array.length - 1;
        int len = array[0].length;
        int i = row;
        int j = 0;

        for (;;) {
            if (i < 0 || j >= len) {
                return false;
            }
            if (array[i][j] < target) {
                j++;
            } else if (array[i][j] > target) {
                i--;
            } else {
                return true;
            }

        }
    }
}
