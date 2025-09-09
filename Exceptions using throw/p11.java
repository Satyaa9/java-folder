class Demo{
	public static void main(String[]args){
		try{
			throw new ArithmeticException("/ by zero");
		}catch(object e){
			e.printStackTrace();
		}
	}
}

/*
OUTPUT:
error: cannot find symbol
                }catch(object e){

Exception cha parent by default object ch aahe pn jr aaplayala heriarachy complete karayachi asel tr aaplyala Exception pasun start karav lagat.
*/