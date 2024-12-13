package ch4_ControlTest;

public class ControlTest164_4 {

	public static void main(String[] args) {
		
//		삼각형을 출력하시오
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < (i+1); k++) {
				System.out.print("*");
			}
			for(int l = 0; l < i ; l++) {
				System.out.print("*");
			}
			
			System.out.println();
				
		}
	}
	
}

