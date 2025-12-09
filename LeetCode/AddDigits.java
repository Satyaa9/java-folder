class AddDigits {
    static int addDigits(int num){
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;
        }
        else{
            return num%9;
        }
    } 
    
    // Main method starts from here

    public static void main(String[] args) {
       int num = 139;
       System.out.println(addDigits(num));
    }  
}


/*
OUTPUT:
4

First we are adding the elements that is addition of elements that 
1+3+9 = 13 and 
then we add the resulting digits that is 1+3 = 4
*/
