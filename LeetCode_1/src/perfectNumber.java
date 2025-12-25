class perfectNumber {
    public static void main(String[] args) {
    Solution1 solution1 = new Solution1();
    int num = 8128;

        System.out.println(solution1.checkPerfectNumber(num));
    }
}
class Solution1{
    public boolean checkPerfectNumber(int num){
        if(num <= 1){
            return false;
        }

        int sum = 1;

        for(int i = 2 ; i <= num/2 ; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
            return true;
        }

       return false;
    }
}
