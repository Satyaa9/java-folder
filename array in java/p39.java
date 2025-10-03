class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};

        
        for (int i = 0; i < arr.length; i++) {
            int freq = 1; 

            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            
            boolean First = true;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    First = false;
                    break;
                }
            }

            if (First) {
                System.out.println("element is "+arr[i] +" : "+ " " +"total aapearnace:"+ freq);
            }
        }
    }
}

/*
OUTPUT:
element is 1 :  total aapearnace:2
element is 2 :  total aapearnace:2
element is 3 :  total aapearnace:1
element is 4 :  total aapearnace:1
*/
