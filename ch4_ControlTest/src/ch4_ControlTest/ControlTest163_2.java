package ch4_ControlTest;

public class ControlTest163_2 {

	public static void main(String[] args) {
		
//		역직각삼각형을 출력하시오
//		*****
//		****
//		***
//		**
//		*
		 
		for(int n = 0; n < 5; n++) {
			for(int i = 5; i > n; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int n = 6; n > 0; n--) {
//			for(int i = 0; i < (n-1); i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
}
