public class Find_Peak_Element {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};
        Solution5 solution5 = new Solution5();

        System.out.print("Index of Peak Element is:");
        System.out.println(solution5.findPeakElement(nums));

    }
}
class Solution5{
    public int findPeakElement(int [] nums){
        int left = 0 ;
        int right = nums.length-1;

        while(left < right){
            int mid = (left+right) / 2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}

/*
OUTPUT:

Index of Peak Element is:5

 */
