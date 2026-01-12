package Recursion;

public class p1 {
    public static void main(String[] args) {
       Solution30 obj = new Solution30();
       int num = 10;
       String s = "Satish";
        System.out.println(obj.name(s));
        System.out.println(obj.sum(num));
        int a = 1;
        fun(a);
           }
    static void fun(int a){
        System.out.println("in fun");
        if(a == 5){
            return ;
        }
        a++;
        fun(a);
    }
}
class Solution30{
    public int sum(int num){
        return num+10;
    }
    public String name(String s){
        return (s + " gouri");
    }
}
