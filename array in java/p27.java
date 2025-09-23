import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={10,40,50,90,95};
		int max=-1;

		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
				
			}
		}
		System.out.println("Maximum element in array is :"+max);
	}
}
/*
OUTPUT:
Maximum element in array is :95

Array madhil maximum number find karnya sathi.

pn hya code madhe aik problem aahe jar mi saglya negative number ghetlya aani tyala max jr mala kadhayacha asel tr to mi ha code use karun nahi kadhu shakat karan negative madhe ha intialize keleli value denar array chi nahi.
*/