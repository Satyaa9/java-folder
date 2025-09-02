interface parent1{
	int a =10;
}
interface parent2{
	int a=20;
}
class child implements parent1,parent2{
	void display(){
		System.out.println(parent1.a);
		System.out.println(parent2.a);
	}
}
class Demo{
	public static void main(String[]args){
		child c = new child();
		c.display();
	}
}

/*
OUTPUT:
10
20
*/