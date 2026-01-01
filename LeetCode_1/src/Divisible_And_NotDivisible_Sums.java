public class Divisible_And_NotDivisible_Sums {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        Solution18 solution18 = new Solution18();
        System.out.print("Divisible and Non-divisible Sums Difference :");
        System.out.println(solution18.sumOfMultiples( n , m));
    }
}
class Solution18{
    public int sumOfMultiples(int n , int m){
        int sum_n = 0;
        int sum_m = 0;

        for(int i = 0 ; i <= n ; i++){
            if (i % m != 0){
                sum_n += i;
            }
            if(i % m == 0){
                sum_m += i;
            }
        }
        return sum_n - sum_m;
    }
}

/*

OUTPUT:
Divisible and Non-divisible Sums Difference :19

 */
