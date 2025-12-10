class Demo{
	public static void main(String [] args){
		Demo demo = new Demo();
		boolean result = demo.ugly(16);
		System.out.println(result);
	}

	public boolean ugly(int n){
		if(n <= 0){
			return false;
		}

		while (n != 0) {
			if(n % 2 == 0){
				n = n/2;
			}
			else if(n % 3 == 0){
				n = n /3;
			}
			else if(n % 5 == 0){
				n = n / 5;
			}
			else{
				break;
			}
		}
		if(n == 1){
			return true;
		}else{
			return false;
		}
	}
}