public class frequencyArray {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,3,4,4,4,4,4};

        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int [] freq = new int[max+1];

        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            System.out.println(i+"-"+freq[i]);
        }
    }
}
