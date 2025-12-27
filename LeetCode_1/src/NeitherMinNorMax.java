public class NeitherMinNorMax {
    public static void main(String[] args) {
        int [] nums = {1,2,4,5};
        Solution3 solution3 = new Solution3();
        System.out.print("Number that not a maximun not a minimun :");
        System.out.println(solution3.findNonMInOrMax(nums));
    }
}
class Solution3{
    public int findNonMInOrMax(int [] nums){
        if(nums.length <= 2){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] < min){
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != max && nums[i] != min){
                return nums[i];
            }
        }
        return -1;
    }
}

/*
 OUTPUT:
 Number that not a maximun not a minimun :2
 */
