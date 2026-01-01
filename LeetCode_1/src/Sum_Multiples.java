public class Sum_Multiples {
    public static void main(String[] args) {
        int n = 15;
        Solution19 solution19 = new Solution19();
        System.out.print("sum of all numbers in the given range satisfying the constraint :");
        System.out.println(solution19.sumOfMultiples(n));
    }
}
class Solution19{
    public int sumOfMultiples(int n){
        int sum = 0 ;
        for (int i = 0 ; i <= n ; i++) {
            if( i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                sum += i;
            }
        }
        return sum;
    }
}

/*

OUTPUT:
sum of all numbers in the given range satisfying the constraint :81
 */
