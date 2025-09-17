import java.util.*;

class politics{
	String name;
	String party;

	politics(String name,String party){
		this.name=name;
		this.party=party;
	}

	void display(){
		System.out.println("This is your name :"+name);
		System.out.println("This is your party :"+party);
	}
}

class Demo{
	public static void main(String[]args){
		Leader obj = new Leader("shubham","bjp");
		Leader obj1 = new Leader("sanket","mns");

		System.out.println(obj.toString());
		System.out.println(obj1);
	}
}

/*
OUTPUT:
Leader@2f92e0f4
Leader@28a418fc

toString() method la return type asto.
hi method non static aahe.
hi method punlic aahe.
hi method override hote.
hi method fkt banalela address dakhavte store nahi krt.
*/