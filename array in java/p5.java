class parent{

	String name;

	parent(String name){
		this.name=name;
	}

	void display(){
		System.out.println("name is :"+name);
	}

}
class Demo{
	public static void main(String[]args){

	parent arr[] = new parent[3];

	arr[0] = new parent("shubham");
	arr[0].display();
	}
}