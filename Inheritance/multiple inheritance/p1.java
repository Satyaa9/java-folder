class Parent1{
	void parent1_property(){
		System.out.println("parent 1 property");
	}
}
class Parent2{
	void parent2_property(){
		System.out.println("parent 2 property");
	}
}
class Child extends Parent1,Parent2{
	void child_property(){
		System.out.println("in child property");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.child_property();
		c.parent1_property();
	
	}
}
/*
OUTPUT:
p1.java:11: error: '{' expected
class Child extends Parent1,Parent2{

karan aapan aika class madhe aikach parent access karu shakto multiple parent access
karu shakat nahi, aani jar aapan te access karayach try kela tr tyach confusion 
hot ki nakki konta parent access karayacha aahe aani mg compiler error det,
yalach DIAMOND PROBLEM as mhantat.
*/