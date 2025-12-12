class removeElement {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int value = 3;
        removeElement satish = new removeElement();
        int result = satish.remove(nums,value);
        System.out.println(result);
    
    }
    
    public int remove(int [] nums , int val){
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
