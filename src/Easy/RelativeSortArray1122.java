package Easy;

//给你两个数组，arr1 和 arr2，
//
//
// arr2 中的元素各不相同
// arr2 中的每个元素都出现在 arr1 中
//
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。
//
//
//
// 示例：
//
//
//输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
//
//
//
//
// 提示：
//
//
// 1 <= arr1.length, arr2.length <= 1000
// 0 <= arr1[i], arr2[i] <= 1000
// arr2 中的元素 arr2[i] 各不相同
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中
//
// Related Topics 排序 数组
// 👍 147 👎 0

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RelativeSortArray1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        List<Integer> list = new ArrayList<>();
        int count = -1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    count++;
                    arr3[count] = arr1[j];
                    arr1[j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != Integer.MAX_VALUE) {
                list.add(arr1[i]);
            }
        }
        Collections.sort(list);
        int flag = 0;
        for (int i = count + 1; i < arr3.length; i++) {
            arr3[i] = list.get(flag);
            flag++;
        }
        return arr3;
    }
}
