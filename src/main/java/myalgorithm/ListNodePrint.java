package myalgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class ListNodePrint {
    /* JZ6 从尾到头打印链表 */

    // 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
    //
    // 如输入{1,2,3}的链表如下图:
    // 返回一个数组为[3,2,1]
    //
    // 0 <= 链表长度 <= 10000

    // 示例1
    // 输入：
    //
    // {1,2,3}
    //
    // 返回值：
    //
    // [3,2,1]
    //
    // 示例2
    // 输入：
    //
    // {67,0,24,58}
    //
    // 返回值：
    //
    // [58,24,0,67]
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ListNode node = listNode;
        while (node != null) {
            arrayList.add(node.val);
            node = node.next;
        }
        Collections.reverse(arrayList);
        return arrayList;

    }
}
