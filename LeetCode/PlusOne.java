import java.util.*;
class Demo{
    public static void main(String[]args){
        int [] digits = {3,5,7};
        System.out.println(Arrays.toString(plusone(digits)));
    }

    static int [] plusone(int [] digits){
        int n = digits.length;

        for(int i = n-1 ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }

        int [] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}

/*
OUTPUT:
[3, 5, 8]
*/