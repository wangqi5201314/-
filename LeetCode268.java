import java.util.Arrays;
import java.util.HashSet;

public class LeetCode268 {
    public static void main(String[] args) {
    /*    输入：nums = [0,1]
        输出：2
        解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
*/
        int []nums={0,1};
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        System.out.println(judge(nums, hashSet));
    }

    private static int judge(int[] nums, HashSet<Integer> hashSet) {
/*        for (Integer integer : hashSet) {
            try {
                if (integer != nums[i]) {
                    return i;
                }
            } catch (Exception e) {
                return 1;
            }
            i++;
        }*/
        for (int i = 0; i <= nums.length; i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        return -1;

    }
}