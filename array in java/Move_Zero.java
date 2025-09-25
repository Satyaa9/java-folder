import java.util.*;
class Move_zero{
	public static void main(String[]args){
		int [] arr={10,0,30,55,0,66};

		int num=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				num=arr[i];
				num++;
			}
		}

		if(num<arr.length){
			arr[num++]=0;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}