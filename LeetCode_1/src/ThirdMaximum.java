class ThirdMaximum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {10,20,30,40,50};
        solution.thirdMax(nums);
        System.out.print("Third max in array :");
        System.out.print(solution.thirdMax(nums));
    }
}
class Solution{
    public int thirdMax(int [] nums){
        if(nums.length == 0){
            return 0;
        }

        long max = Long.MIN_VALUE;
        long s_max = Long.MIN_VALUE;
        long t_max = Long.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == max || nums[i] == s_max || nums[i] == t_max){
                continue;
            }

            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] > s_max && nums[i] != max){
                s_max = nums[i];
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > t_max && nums[i] != max && nums[i] != s_max){
                t_max = nums[i];
            }
        }

        if(t_max == Long.MIN_VALUE){
            return (int) max;
        }

        return (int) t_max;
    }

}

/*
OUTPUT:

Third max in array :30

*/
