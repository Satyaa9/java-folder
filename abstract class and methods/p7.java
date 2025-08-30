abstract class parent{
	abstract void education();
}
class child extends parent{
		void education(){
			System.out.println("BCA...");
	}
}
class Demo{
	public static void main(String[]args){
		child c = new child();
		c.education();
	}
}
/*
OUTPUT:BCA...

Abstract mule parent la body lihayala jo time west karava lagat hota to kami zala.
Pn tyane child vr kahi restrictions lavlya ki tula he kam karav lagel mg tu te kontya pn field madhe kr
*/