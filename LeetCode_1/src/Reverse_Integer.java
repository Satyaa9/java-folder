public class Reverse_Integer {
    public static void main(String[] args) {
        int x = 145;

        System.out.print("Original Integer :" + x);
        Solution6 solution6 = new Solution6();

        System.out.println();
        System.out.print("Reversed Integer:");
        System.out.println(solution6.reverse(x));
    }
}

class Solution6 {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        return rev;
    }
}

/*
OUTPUT:

Original Integer :145
Reversed Integer:541

 */
