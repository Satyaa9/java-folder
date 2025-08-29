abstract class parent{
	abstract void property();
}
class child extends parent{

}
class Demo{
	public static void main(String[]args){
		child c = new child();
		c.property();
	}
}
/*
OUTPUT:
error: child is not abstract and does not override abstract method property() in parent
class child extends parent{

Karan appan extend laval ki child la sangto ki parent ch sagal access kr pn parent ha abstract aahe aani tyala jr without any change access karayacha asel tr jya class madhe access karayacha aahe to class pn abstract class pahijel.
*/