public class LeetCode1281SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        int n =234;

        Solution27 solution27 = new Solution27();
        System.out.print("difference between the product of its digits and the sum of its digits : ");
        System.out.println(solution27.subtractProductAndSum(n));
    }
}
class Solution27{
    public int subtractProductAndSum(int n){
        int sum = 0 ;
        int product =1 ;

        while(n != 0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        return (product - sum);
    }
}

/*

OUTPUT:
difference between the product of its digits and the sum of its digits : 15

 */
