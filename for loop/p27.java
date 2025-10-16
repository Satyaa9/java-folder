class Demo{
	public static void main(String[]args){
		
	char ch ='A';
	
	for(int i = 1; i <= 5; i++){
		for(int j = 1; j <= 6; j++){
			System.out.print(ch);

		if(j < 6){
			System.out.print("_");
			}
		ch++;
			}
			System.out.println();	
		}
	}
}

/*
OUTPUT:
A_B_C_D_E_F
G_H_I_J_K_L
M_N_O_P_Q_R
S_T_U_V_W_X
Y_Z_[_\_]_^
*/