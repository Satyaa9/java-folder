class Demo  {
    public int majority(int [] arr){
        int maj = arr[0];
        int count = 1 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == maj){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                maj = arr[i];
                count = 1;
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        int [] arr = {5,5,8,8,8,8,1};

        int maj = demo.majority(arr);
       
        System.out.println("Majority Element is :"+maj);
    }
}

/*
OUTPUT:
Majority Element is :8
*/
