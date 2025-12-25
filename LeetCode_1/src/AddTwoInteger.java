public class AddTwoInteger {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int num1 = 10;
        int num2 = 20;

        System.out.print("Sum of Two Numbers: ");
        System.out.println(solution2.sum(num1,num2));
    }
}
class Solution2{
    public int sum(int num1 , int num2){
        int total = num1 + num2;

        return total;
    }
}
/*
OUTPUT:

Sum of Two Numbers: 30

*/
