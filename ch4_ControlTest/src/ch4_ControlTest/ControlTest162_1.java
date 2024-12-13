package ch4_ControlTest;

public class ControlTest162_1 {

	public static void main(String[] args) {
		
//		직각삼각형을 출력하시오
//		*
//		**
//		***
//		****
//		*****
		
//		0<1
//		1<2
//		2<3
//		3<4
//		4<5
//		5<6
//		6
		
		for(int n = 0; n < 5; n++) {
			for(int i = 0; i < (n+1); i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		for(int n = 0; n < 5; n++) {
			for(int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
