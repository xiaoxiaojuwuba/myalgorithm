package myalgorithm;

public class RotationArray {
    /* JZ11 旋转数组的最小数字 */

    // 有一个长度为 n
    // 的非降序数组，比如[1,2,3,4,5]，将它进行旋转，即把一个数组最开始的若干个元素搬到数组的末尾，变成一个旋转数组，比如变成了[3,4,5,1,2]，或者[4,5,1,2,3]这样的。请问，给定这样一个旋转数组，求数组中的最小值。
    //
    // 数据范围：1≤n≤100001 \le n \le 100001≤n≤10000，数组中任意元素的值: 0≤val≤100000 \le val
    // \le 100000≤val≤10000
    // 要求：空间复杂度：O(1)O(1)O(1) ，时间复杂度：O(logn)O(logn)O(logn)

    // 示例1
    // 输入：
    //
    // [3,4,5,1,2]
    //
    // 返回值：
    //
    // 1
    //
    // 示例2
    // 输入：
    //
    // [3,100,200,3]
    //
    // 返回值：
    //
    // 3

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    // O(Log n)
    public int minNumberInRotateArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            if (array[left] < array[right]) {
                return array[left];
            }
            int mid = left + (right - left) / 2;

            if (array[mid] < array[right]) {
                right = mid;
            } else if (array[mid] > array[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }

        return array[left];
    }
}
