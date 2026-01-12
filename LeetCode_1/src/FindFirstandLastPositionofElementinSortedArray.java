public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int [] nums = {5,7,7,8,8,10};

        System.out.println(solution28.searchRange(nums, 8));

    }
}
class Solution28{
    public int [] searchRange(int [] nums, int target){
        int [] arr = new int[2];
        arr[0] = arr[1] = -1;

        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == target){
                arr[0] = i;
                while (i < nums.length-1 && nums[i+1] == target){
                    arr[1] = i;
                    break;
                }
            }
        }
        return arr;
    }
}
