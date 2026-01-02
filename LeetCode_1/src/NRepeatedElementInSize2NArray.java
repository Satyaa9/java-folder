public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        int [] nums = {2,3,5,6,7,5};

        System.out.print("Repeated numbers in array :");
        Solution20 solution20 = new Solution20();
        System.out.println(solution20.repeated(nums));

    }
}
class Solution20{
    public int repeated(int [] nums){
        int result = 0;

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i +1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    result = nums[i];
                }
            }
        }
        return result;
    }
}

/*

OUTPUT:

Repeated numbers in array :5

 */
