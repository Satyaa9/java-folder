import java.util.*;
public class SingleNumber_2 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int [] nums = {1,3,2,4,1,3};

        System.out.print("Array of element that are unique :");
        System.out.println(Arrays.toString(solution17.singleNumber(nums)));
    }
}
class Solution17{
    public int [] singleNumber(int [] nums){

        int [] result = new int[2];
        int index = 0;

        for(int i = 0 ; i < nums.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }
}

/*
OUTPUT:

Array of element that are unique :[2, 4]

* */
