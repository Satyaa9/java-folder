import java.util.*;
class frequency_of_each_element{
	public static void main(String[]args){

		int [] arr={1,2,3,4,1,5,2,6,5,6};

		HashMap<Integer, Integer> hm = new HashMap();

		for(int num : arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
		}
		 for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
           	 System.out.println( entry.getKey() + ":Frequiency :" + entry.getValue());

      		  }
	}
}

/*
OUTPUT:
1:Frequiency :2
2:Frequiency :2
3:Frequiency :1
4:Frequiency :1
5:Frequiency :2
6:Frequiency :2
*/