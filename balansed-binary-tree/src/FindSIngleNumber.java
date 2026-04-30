import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindSIngleNumber {
    static void main() {
        System.out.println(singleNumber(new int[]{2, 2, 3, 2}));
    }

        public static int singleNumber(int[] nums) {
            int ones = 0, twos = 0;
            for (int num : nums) {
                ones = (ones ^ num) & ~twos;
                twos = (twos ^ num) & ~ones;
            }
            return ones;

    }
}
