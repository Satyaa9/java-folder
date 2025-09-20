import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("shubham");
		al.add("sanket");
		al.add("ram");

		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}