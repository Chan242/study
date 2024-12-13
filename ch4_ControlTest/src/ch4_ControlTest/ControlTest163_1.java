
//중첩 for문으로 구현해보자
package ch4_ControlTest;
public class ControlTest163_1 {

	public static void main(String[] args) {
//		출력형태
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		,,,
//		2 * 9 = 18
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		,,,
//		3 * 9 = 27
//		,,,
//		9 * 1 = 9
//		9 * 2 = 18
//		9 * 3 = 27
//		,,,
//		9 * 8 = 72
//		9 * 9 = 81
		
		int result = 0;
		
//		for(int i = 2; i < 10; i++) {
//			for(int n = 1; n < 10; n++) {
//				result = i * n;
//				System.out.println(i + " * " + n + " = " + result);
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 1; i < 10; i++) {
//			for(int n = 2; n < 10; n++) {
//				result = i * n;
//				System.out.print(n + " * " + i + " = " + result + "\t");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < 9; i++) {
			for(int n = 0; n < 8; n++) {
				result = (n+2) * (i+1);
				System.out.print((n+2) + " * " + (i+1) + " = " + result + "\t");
			}
			System.out.println();
		}
		
	}
	
}
