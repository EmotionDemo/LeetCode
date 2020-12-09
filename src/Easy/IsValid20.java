package Easy;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串
// 👍 2031 👎 0

import java.util.Stack;

public class IsValid20 {

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        if (s.equals("")) {
            return true;
        }
        if (s.charAt(0) == '{' || s.charAt(0) == '[' || s.charAt(0) == '(') {

        } else {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {    // 如果是左括号，则将其放入栈内
                stack.push(s.charAt(i));
                sum++;
            }
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {   // 如果是右括号
                if (!stack.isEmpty()) {
                    if (stack.peek() + s.charAt(i) == '(' + ')' || stack.peek() + s.charAt(i) == '[' + ']' || stack.peek() + s.charAt(i) == '{' + '}') {
                        stack.pop();
                        sum--;
                    } else {
                        sum++;
                    }
                }else {
                    sum++;
                }
            }
        }
        if (stack.empty() && sum == 0) {
            return true;
        }
        return false;
    }


}
