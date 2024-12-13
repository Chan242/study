package ch4_ControlTest;

public class ControlTest164_3 {

	public static void main(String[] args) {
		
//		삼각형을 출력하시오
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for(int n = 0; n < 5; n++) {
			for(int y = 4; y > n; y--) {
				System.out.print(" ");
			}
			for(int i = 0; i < (n+1); i++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
//		for(int n = 0; n < 5; n++) {
//			for(int i = 5; i > n; i--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int x = 5; x > 0; x--) {
//			for(int y = 0; y < (x-1); y++) {
//				System.out.print("-");
//			}
//			System.out.println();
//		}
		
	}
	
}
