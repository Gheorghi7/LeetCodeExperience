import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumSubArray {
    static void main() {
        System.out.println(minLength(new int[]{6}, 3));
        Solution solution = new Solution();
        System.out.println(solution.firstUniqueEven(new int[]{1, 6,4, 3, 4}));
    }

    public static int minLength(int[] A, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int i = 0, n = A.length, res = n + 1;
        for (int j = 0; j < A.length; j++) {
            int a = A[j];
            cnt.put(a, cnt.getOrDefault(a, 0) + 1);
            if (cnt.get(a) == 1)
                k -= a;
            while (k <= 0) {
                res = Math.min(res, j - i + 1);
                cnt.put(A[i], cnt.get(A[i]) - 1);
                if (cnt.get(A[i]) == 0)
                    k += A[i];
                i++;
            }
        }
        return res > n ? -1 : res;
    }

}

class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n : nums) {
            if (n % 2 == 0 && map.get(n) == 1) {
                return n;
            }
        }
        return -1;
    }
}
