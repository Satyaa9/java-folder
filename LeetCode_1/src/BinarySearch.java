public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {1,2,6,4,8,9};
        int target = 4;

        Solution10 solution10 = new Solution10();

        System.out.print("Index of search element is :");
        System.out.println(solution10.search(nums,target));

    }
}
class Solution10{
    public int search(int [] nums , int target){
        if(nums.length == 0){
            return -1;
        }
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}

/*
OUTPUT:
Index of search element is :3
 */
