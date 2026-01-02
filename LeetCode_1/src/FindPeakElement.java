public class FindPeakElement {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();

        System.out.print("Answer is :");
        int [] nums = {1,2,3,4,5,6,7};
        System.out.println(solution21.findPeak(nums));

    }
}

class Solution21 {
    public int findPeak(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

/*

OUTPUT:
Answer is :6

 */
