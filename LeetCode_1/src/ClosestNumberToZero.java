public class ClosestNumberToZero {
    public static void main(String[] args) {
        int[] nums = {20, 5, -1};

        Solution4 solution4 = new Solution4();
        System.out.print("Closest number to zero :");
        System.out.println(solution4.findClosestNumber(nums));
    }
}

class Solution4 {
    public int findClosestNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int closestNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (Math.abs(num) < Math.abs(closestNum)) {
                closestNum = num;
            } else if (Math.abs(num) == Math.abs(closestNum)) {
                closestNum = Math.max(closestNum, num);
            }
        }
        return closestNum;
    }
}

/*
OUTPUT:

Closest number to zero :-1

 */
