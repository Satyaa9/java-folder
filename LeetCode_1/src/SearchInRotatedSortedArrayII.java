public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
        int target = 3;

        Solution22 solution22 = new Solution22();

        System.out.println(solution22.search(nums,target));

    }
}
class Solution22{
    public boolean search(int [] nums, int target){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = nums.length -1; j >1 ; j--){
                if(nums[i] == target || nums[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
