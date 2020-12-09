package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
//
// 输入: 121
//输出: true
//
//
// 示例 2:
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
//
// 示例 3:
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
//
// 进阶:
//
// 你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学
// 👍 1330 👎 0
public class IsPalindrome09 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (String.valueOf(x).length() == 1){
            return true;
        }
        boolean isHw = false;
        String str = String.valueOf(x);
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (int i = 0; i <= str.length() / 2 - 1; i++) {
            list1.add(str.charAt(i));
        }

        if (str.length() % 2 == 0) {
            for (int j = str.length() / 2; j < str.length(); j++) {
                list2.add(str.charAt(j));
            }
        } else {
            for (int j = str.length() / 2 + 1; j < str.length(); j++) {
                list2.add(str.charAt(j));
            }
        }

        Collections.reverse(list2);
        for (int n = 0; n < list1.size(); n++) {
            if (!list1.get(n).equals(list2.get(n))) {
                isHw = false;
                break;
            } else {
                isHw = true;
            }
        }
        return isHw;
    }
}
