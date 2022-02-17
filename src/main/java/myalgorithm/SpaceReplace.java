package myalgorithm;

public class SpaceReplace {
    /* JZ5 替换空格 */
    // 描述
    // 请实现一个函数，将一个字符串s中的每个空格替换成“%20”。
    // 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    //
    // 数据范围:0≤len(s)≤1000 0 \le len(s) \le 1000 \ 0≤len(s)≤1000
    // 。保证字符串中的字符为大写英文字母、小写英文字母和空格中的一种。
    // 进阶：时间复杂度 O(n) O(n)\ O(n) ,空间复杂度 O(n) O(n) \ O(n)

    // 示例1
    // 输入：
    //
    // "We Are Happy"
    //
    // 返回值：
    //
    // "We%20Are%20Happy"
    //
    // 示例2
    // 输入：
    //
    // " "
    //
    // 返回值：
    //
    // "%20"

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String replaceSpace(String s) {
        String re = "";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                re = re + "%20";
            } else {
                re = re + c;
            }
        }
        return re;
    }

    public String replaceSpace2(String s) {
        return s.replace(" ", "%20");
    }
}
