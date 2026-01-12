import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        Solution31 solution31 = new Solution31();

        System.out.print("Concated array : ");
        System.out.println(Arrays.toString(solution31.getConcatation(arr)));

    }
}
class Solution31{
    public int [] getConcatation(int [] nums){
    int n = nums.length;
    int [] arr = new int[n*2];

    for(int i = 0 ; i < nums.length ; i++){
        arr[i] = nums[i];
        arr[i+n] = nums[i];
    }
    return arr;
    }
}

/*

OUTPUT:
Concated array : [1, 2, 1, 1, 2, 1]

 */
