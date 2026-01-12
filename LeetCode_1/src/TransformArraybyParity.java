import java.lang.reflect.Array;
import java.util.Arrays;

public class TransformArraybyParity {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        int [] nums = {1,5,1,4,2};

        System.out.println(Arrays.toString(solution32.transformArray(nums)));

    }
}
class Solution32{
    public int [] transformArray(int [] nums) {
        int n = nums.length;
        int [] arr = new int[n];

        for(int i = 0 ; i < nums.length ; i++){
            if(i%2 == 0){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i +1 ; j < arr.length ; j++){
                int temp = arr[i];
                if(arr[j] < arr[i]){
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
//        Arrays.sort(arr);
        return arr;
    }
}
