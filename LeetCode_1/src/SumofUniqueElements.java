public class SumofUniqueElements {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
        int sum = 0;
        for(int i = 0 ; i< nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(nums[i]+" ");
                sum += nums[i];
            }
        }
        System.out.println();
        System.out.println("Sum of uniq elements :"+sum);
    }
}

/*

OUTPUT:
1 3
Sum of uniq elements :4
 */

