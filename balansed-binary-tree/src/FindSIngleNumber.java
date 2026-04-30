import java.util.HashSet;
import java.util.Set;

public class FindSIngleNumber {
    static void main() {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            boolean b = !set.contains(nums[i]) ? set.add(nums[i]) : set.remove(nums[i]);
        }


        return set.iterator().next();

    }
}
