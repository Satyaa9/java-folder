class Codex{
	int modelId;
	String brand;

	void display(){
	System.out.println("Model No :"+ modelId);
	System.out.println("Brand name :"+ brand);
	}
}
class Demo{
	public static void main(String[]args){
	Codex alto = new Codex();
	alto.modelId=1234;
	alto.brand="Maruti";
	

	Codex wagnar = new Codex();
	wagnar.modelId=445;
	wagnar.brand="g-wagnar";

	alto.display();
	System.out.println("-------------------");
	wagnar.display();

	}
}
/*
OUTPUT:
Model No :1234
Brand name :Maruti
-------------------
Model No :445
Brand name :g-wagnar
*/