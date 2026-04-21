import java.util.*;

public class Main {
    static void main() {
    Solution solution = new Solution();
    System.out.println(solution.getConcatenation(new int[]{1,2,3}));
    }

}


class Solution {
    public int[] getConcatenation(int[] nums) {
        nums = Arrays.copyOf(nums, 2*nums.length);
        for (int i = 0; i < (nums.length/2); i++) {
            nums[i+(nums.length/2)] = nums[i];
        }
    return nums;
}
}