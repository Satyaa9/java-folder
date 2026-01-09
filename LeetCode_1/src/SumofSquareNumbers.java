public class SumofSquareNumbers {
    public static void main(String[] args) {
        int n = 18;
        Solution25 solution25 = new Solution25();

        System.out.print("a2 + b2 = c : ");
        System.out.println(solution25.squareSum(n));
    }
}
class Solution25{
    public boolean squareSum(int c ){
        int limit = (int) Math.sqrt(c);

        for(int i = 0 ; i <=limit; i++){
            int j = limit;
            while(j >=i){
                long sum = (long) i * i + (long) j * j;
                if(sum == c){
                    return true;
                }if(sum > c){
                    j --;
                }else{
                    break;
                }
            }
        }
        return false;
    }
}

/*
OUTPUT:
a2 + b2 = c : true

 */
