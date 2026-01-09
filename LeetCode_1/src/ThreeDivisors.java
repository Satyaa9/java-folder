public class ThreeDivisors {
    public static void main(String[] args) {
        int n = 4 ;
        Solution24 solution24 = new Solution24();
        System.out.println("Integer exactly divisible by three number :");
        System.out.println(solution24.isThree(n));

    }
}
class Solution24{
    public boolean isThree(int n){

        int count = 0 ;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 3){
            return true;
        }
        return false;
    }
}
