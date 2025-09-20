import java.util.*;
class teacher{
	String name;

	teacher(String name){
		this.name=name;
	}

	String getName(){
		return name;
	}
}
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();
		
		al.add(new teacher("shubham"));
		al.add(new teacher("sanket"));
		al.add(new teacher("prem"));

		for(Object obj:al){
			teacher t = (teacher)obj;
			System.out.println(t.getName());
		}
	}
}

/*
OUTPUT:
shubham
sanket
prem
*/