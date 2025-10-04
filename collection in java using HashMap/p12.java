import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,2,2,3,4,4};

		HashMap<Integer, Integer>hm = new HashMap();
		
		for(int i=0; i< arr.length; i++){
			hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
		}

		for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
			System.out.println("key :"+entry.getKey()+": values :"+entry.getValue());

		}
	}
}

/*
OUTPUT:
key :1: values :1
key :2: values :2
key :3: values :1
key :4: values :2
*/