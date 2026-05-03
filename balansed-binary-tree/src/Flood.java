import java.util.*;

public class Flood {
    static void main() {
        int[] newInt = avoidFlood(new int[]{1, 2, 0, 0, 1, 2});
        for (int i : newInt) {
            System.out.println(i);
        }
    }

    //1,2,0,0,1,2
    public static int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        Map<Integer,Integer> last = new HashMap<>();
        TreeSet<Integer> dry = new TreeSet<>();

        for (int i = 0; i < n; ++i) {
            if (rains[i] > 0) {
                int lake = rains[i];
                ans[i] = -1;
                if (last.containsKey(lake)) {
                    int prev = last.get(lake);
                    Integer dryDay = dry.higher(prev);
                    if (dryDay == null) return new int[0];
                    ans[dryDay] = lake;
                    dry.remove(dryDay);
                }
                last.put(lake, i);
            } else {
                dry.add(i);
            }
        }
        return ans;
    }
}


