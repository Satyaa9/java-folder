import java.util.Arrays;

public class Squaresof_a_SortedArray {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        int [] nums = {-4,-1,0,3,10};

        System.out.print("array of the squares of each number sorted in non-decreasing order : ");
        System.out.println(Arrays.toString(solution34.sortedSquere(nums)));


    }
}
class Solution34{
    public int [] sortedSquere(int [] nums){
        int n = nums.length;
        int [] arr = new int[n];

        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[i] * nums[i];
        }

        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

/*
OUTPUT:

array of the squares of each number sorted in non-decreasing order : [0, 1, 9, 16, 100]

 */
