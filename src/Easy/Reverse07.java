package Easy;

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学
// 👍 2387 👎 0
public class Reverse07 {
    public int reverse(int x) {

        String str;
        if (x < 0) {
            str = String.valueOf(x).substring(1);
        } else {
            str = String.valueOf(x);
        }
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (Long.parseLong(reverse) > Integer.MAX_VALUE || Long.parseLong(reverse) < Integer.MIN_VALUE) {
            return 0;
        }
        int i = Integer.parseInt(reverse.trim());
        if (x < 0) {
            i = i * -1;
        }
        return i;
    }
}
