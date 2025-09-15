class parent{
	String name;
	int age;

	parent(String name, int age){
		this.name=name;
		this.age=age;
	}

	void display(){
		System.out.println("Enter name :"+name);
		System.out.println("Enter age :"+age);
	}
}
class Demo{
	public static void main(String[]args){
		parent arr[] = new parent[3];
		arr[0]= new parent("shubham",27);
		arr[0].display();

		System.out.println("----------------------------");

		arr[1]= new parent("sanket",28);
		arr[1].display();

		System.out.println("---------------------------");

		arr[2]= new parent("satish",30);
		arr[2].display();
		System.out.println("----------------------------");

	}
}

/*
OUTPUT:
Enter name :shubham
Enter age :27
----------------------------
Enter name :sanket
Enter age :28
---------------------------
Enter name :satish
Enter age :30
----------------------------
*/