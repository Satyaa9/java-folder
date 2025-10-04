import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap hm = new HashMap();
		int [] arr={1,2,3,4};

		for(int i=0;i<arr.length;i++){
			hm.put(arr[i].getordefault(arr[i],0)+1);
		}
	}
}