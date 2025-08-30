interface parent{
	

void fun();
}
interface child extends parent{

}
class Demo{
	public static void main(String[]args){
	
	}
}

/*
OUTPUT:
Ass lihilya vr kahi problem nahi yet pn aapalyala jr child class madhal sagal acces karayach asel tr 
tr aapan te nahi karu shakat karan interface cha object banat nahi.

Interface chya class madhe jr incomplete method lihili tr ti by default abstract method ashi act karte,
aani tya pudhe public abstract ass by default asatach.

BYTECODE:
interface parent {
  public abstract void fun();
}
*/