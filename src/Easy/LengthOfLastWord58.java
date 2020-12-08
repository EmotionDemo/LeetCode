package Easy;


//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
//
// 如果不存在最后一个单词，请返回 0 。
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
//
//
//
// 示例:
//
// 输入: "Hello World"
//输出: 5
//
// Related Topics 字符串
// 👍 262 👎 0
import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord58 {

    public int lengthOfLastWord(String s) {
        int result;
        int pointer = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                pointer++;
            }

            if (c != ' ' && pointer == 0) {
                list.add(s.charAt(i));
            }

            if (c != ' ' & pointer != 0) {
                list.clear();
                list.add(c);
                pointer = 0;
            }


        }
        result = list.size();
        return result;

    }
}

