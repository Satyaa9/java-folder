public class SecondApproachContainerWithMostWater {
    public static void main(String[] args) {

        int [] height = {1,8,6,2,5,4,8,3,7};

        Solution12 solution12 = new Solution12();

        System.out.print("Max area in the container with water:");
        System.out.println(solution12.maxArea(height));
    }
}
class Solution12{
    public int maxArea(int [] height){
        int n = height.length;
        int max = 0;

        int left = 0;
        int right = n-1;

        while (left < right){
            int width = right - left;
            int h = Math.min(height[left] , height[right]);

            int area = width * h;

            if(area > max){
                max = area;
            }

            if (height[left] < height[right]){
                left++;
            }else {
                right --;
            }
        }

        return max;
    }
}

/*

OUTPUT:
Max area in the container with water:40

 */
