public class ValidPalindromeString {
    public static void main(String[] args) {
        String s = "naman";
        Solution15 solution15 = new Solution15();

        System.out.print("String is palindrome :");
        System.out.println(solution15.isPalindrome(s));

    }
}
class Solution15{
    public boolean isPalindrome(String s){

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]" ,"");
        int i = 0 ;
        int j = s.length()-1;

        while (i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else {
                i ++;
                j--;
            }
        }
        return true;
    }
}

/*

OUTPUT:
String is palindrome :true

 */
