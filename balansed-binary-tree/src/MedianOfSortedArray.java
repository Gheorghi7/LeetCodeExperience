import java.util.Arrays;

public class MedianOfSortedArray {

    static void main() {
        System.out.println( findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        if(nums1[0] > nums2[0]){
            return findMedianSortedArrays(nums2, nums1);
        }
        int[] array = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, array, 0, nums1.length);
        System.arraycopy(nums2, 0, array, nums1.length, nums2.length);
        Arrays.sort(array);
        if(array.length % 2 == 0){
            median=(array[array.length/2] + array[array.length/2-1])/2.0;
        }else{
            median = array[array.length/2];
        }   

        return median;
    }
}
