class Demo{
	public static void main(String[]args){

		try{
			throw new ArithmeticException("/ by zero");
		}catch(Demo e){
			e.printStackTrace();
		}
	
	}
}

/*
OUTPUT:
error: incompatible types: Demo cannot be converted to Throwable
                }catch(Demo e){

Karan exception cha saglya class cha parent ha Exception ha asto aani tyala heirachi madhilach reference chaltat 
*/