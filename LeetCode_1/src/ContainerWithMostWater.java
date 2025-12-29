public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,0};

        Solution11 solution11 = new Solution11();

        System.out.print("Maximum area with water in the container :");
        System.out.println(solution11.maxArea(height));
    }
}
class Solution11{
    public int maxArea(int [] height){

        int n = height.length;
        int max = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int width = j - i;
                int h = Math.min(height[i] , height[j]);

                int area = width * h;

                if(area > max){
                    max = area;
                }
            }
        }
        return max;
    }
}
