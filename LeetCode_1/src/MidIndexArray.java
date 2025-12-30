public class MidIndexArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};
        Solution14 solution14 = new Solution14();
        System.out.println(solution14.mid(nums));

    }
}

class Solution14 {
    public int mid(int[] nums) {
        int sum = 0;

        for (int i = 0;i < nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];

            if (leftSum == sum) {
                return i;
            }else{
                leftSum += nums[i];
            }
        }
        return -1;
    }
}

