public class SearchInsertPosition {
    public static void main(String[] args) {

        Solution33 solution33 = new Solution33();
        int [] nums = {1,3,5,6};
        int target = 5;

        System.out.print("index where it would be if it were inserted in order : ");
        System.out.println(solution33.searchInsert(nums,target));

    }
}
class Solution33{
    public int searchInsert(int [] nums , int target){
        int n = nums.length;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}

/*
OUTPUT:

index where it would be if it were inserted in order : 2
 */
