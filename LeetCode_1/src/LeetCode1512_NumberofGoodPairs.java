public class LeetCode1512_NumberofGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};

        Solution26 solution26 = new Solution26();

        System.out.print("number of good pairs : ");
        System.out.println(solution26.Identicalpairs(nums));

    }
}
class Solution26{
    public int Identicalpairs(int [] nums){
        int count = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

/*
OUTPUT:
number of good pairs : 4

 */
