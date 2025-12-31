public class SingleNumber_1 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,5,2,3,1};

        Solution16 solution16 = new Solution16();

        System.out.print("Element that aapears only one time :");
        System.out.println(solution16.singleNum(nums));
    }
}
class Solution16{
    public int singleNum(int [] nums){


        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }
}

/*

OUTPUT:
Element that aapears only one time :5
 */
