public class Maximum_Gap {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 5, 6, 6, 6, 6};
        Solution7 solution7 = new Solution7();

        System.out.print("Maximum gap Between Elements :");
        System.out.println(solution7.maximunGap(nums));

    }
}

class Solution7 {
    public int maximunGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int gap = 0;
        for (int i = 1; i < nums.length; i++) {
            gap = Math.max(gap, nums[i] - nums[i - 1]);
        }
        return gap;
    }
}

/*
OUTPUT:

Maximum gap Between Elements :4

 */
