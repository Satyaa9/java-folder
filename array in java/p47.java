//rotating array by k postition

import java.util.*;
class Demo{
    static void reverse(int [] a , int start , int end){
        int temp = a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
    }

    static void rotate(int [] a , int k){
        k=k%a.length;
        if(k<0){
            k=k+a.length;
        }
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n = sc.nextInt();

        int [] a = new int[n];
        System.out.print("Enter the array elements :");

        for(int i = 0 ; i < a.length ; i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter the value of k :");
        int k = sc.nextInt();

        System.out.print("Original array :");
        for(int i = 0 ; i < a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.print("Array after rotation :");
        rotate(a, k);
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
}

/*
OUTPUT:

Enter the array size :9
Enter the array elements :10 20 30 40 50 60 70 80 90
Enter the value of k :5
Original array10 20 30 40 50 60 70 80 90 
Array after rotation :60 20 30 40 10 90 70 80 50
*/
