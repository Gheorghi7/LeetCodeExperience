void main() {
    Solution sol = new Solution();
    System.out.println(sol.shuffle(new int[]{1, 2, 3, 4, 3, 2, 1}, 4));
}

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] prefixLeft = Arrays.copyOfRange(nums, 0, n - 1);
        int[] prefixRight = Arrays.copyOfRange(nums, n - 1, nums.length);
        int i = 0, j = 0;
        while(i < prefixLeft.length && j < prefixRight.length) {

            }
        return nums;

    }
}