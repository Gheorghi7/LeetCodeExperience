import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    static void main() {
        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int longest = 0;
        Set<Character> set = new HashSet<>();
        int n = s.length();
        for (int r = 0; r < n; r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l += 1;
            }
            int w = (r - l) + 1;
            longest = Math.max(longest, w);
            set.add(s.charAt(r));
        }
        return longest;
    }

}
