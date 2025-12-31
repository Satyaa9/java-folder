class Solution {
    public static void main(String[] args) {
        int x = 1234;

        int sum = 0;
        for (; x > 0;) {
            int rem = x % 10;

            sum += rem;
            x = x / 10;
        }
        System.out.print(sum);
    }
}
