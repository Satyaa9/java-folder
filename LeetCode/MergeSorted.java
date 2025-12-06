class Demo {
    public void merge(int [] nums1 , int m , int [] nums2 , int n){

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};

        System.out.print("nums1 array before merge :");
        for(int i = 0 ; i < nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println();

        System.out.print("nums2 array before merge :");
        for(int i = 0 ; i < nums2.length; i++){
            System.out.print(nums2[i]+" ");
        }

        System.out.println();

        int m = 3;
        int n = 3;

        Demo demo = new Demo();
        demo.merge(nums1, m, nums2, n);
        System.out.print("Arrays after merging :");
        for(int i = 0 ; i < nums1.length ; i++){
            System.out.print(nums1[i] +" ");
        }
    }
}

/*
OUTPUT:
nums1 array before merge :1 2 3 0 0 0 
nums2 array before merge :2 5 6 
Arrays after merging :1 2 2 3 5 6 
*/
