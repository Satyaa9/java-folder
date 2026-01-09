public class Harshad_Number {
    public static void main(String[] args) {
        int x = 18;

        Solution23 solution23 = new Solution23();
        System.out.print("output :");
        System.out.println(solution23.sumOfHarshedNumber(x));

    }
}
class Solution23{
    public int sumOfHarshedNumber(int x){
        int original = x;
        int sum = 0;

        while (x != 0){
            int digit = x % 10;
            sum += digit;
            x = x /10;
        }
        if(original % sum == 0){
            return sum;
        }
        return -1;
    }
}

/*

OUTPUT :

output :9

 */
