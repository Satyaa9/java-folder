class Demo{
	public static void main(String[]args){
		
		for(int i = 65; i<= 90; i++){
			char ch = (char) i;
			System.out.print(ch);
			if(i < 90){
				System.out.print("_");
			}
		}
	}
}

/*
OUTPUT:
A_B_C_D_E_F_G_H_I_J_K_L_M_N_O_P_Q_R_S_T_U_V_W_X_Y_Zs
*/