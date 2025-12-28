public class GreaterMaxOMin {
    public static void main(String[] args) {
        int [] nums = {1,3,6,8,2,-4,-3,-2,0};

        Solutions9 solutions9 = new Solutions9();

        System.out.print("Maximum difference between positive and negative count :");
        System.out.println(solutions9.findDifference(nums));

    }
}

class Solutions9{
    public int findDifference(int [] nums){
        if(nums.length == 0){
            return 0;
        }
        int zero_count = 0;
        int pos_count = 0;
        int neg_count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                pos_count++;
            }
            if(nums[i] < 0){
                neg_count++;
            }
            if(nums[i] == 0){
                zero_count++;
            }
        }
        if (pos_count >= neg_count){
            return pos_count;
        }
        return neg_count;
    }
}
/*
OUTPUT:

Maximum difference between positive and negative count :5

 */
