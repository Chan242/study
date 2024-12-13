
//중첩 for문으로 구현해보자
package ch4_ControlTest;
public class ControlTest163_3 {

	public static void main(String[] args) {
//		출력형태
//		2 * 1 = 2	2 * 2 = 4	2 * 3 = 6 ,,, 2 * 9 = 18
//		,,,
//
//		9 * 1 = 9	9 * 2 = 18	9 * 3 = 27	,,, 9 * 9 = 81
//		
//		
		
		int result = 0;
		 
		for(int i = 2; i < 10; i++) {
			for(int n = 1; n < 10; n++) {
				result = i * n;
				System.out.print(i + " * " + n + " = " + result + "\t");
			}
			System.out.println();
		}
		
		
		
	}
	
}
