public class Array_Sorting {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 8, 10, 15, 9, 2};
        System.out.print("Sorted Array :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
/*
OUTPUT:

Sorted Array :1 2 4 6 8 9 10 15

 */

