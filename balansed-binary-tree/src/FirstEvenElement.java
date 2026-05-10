import java.util.HashMap;
import java.util.Map;

public class FirstEvenElement {

    static void main() {
        int[] arr = {2,2,2};
        System.out.println(mostFrequentEven(arr));
    }

    public static int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int freq[] = new int[100001];
        int ans = -1, maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                freq[nums[i]]++;
                if (freq[nums[i]] == maxFreq) {
                    ans = Math.min(ans, nums[i]);
                } else if (freq[nums[i]] > maxFreq) {
                    ans = nums[i];
                    maxFreq = freq[nums[i]];
                }
            }
        }

        return ans;
    }
}
