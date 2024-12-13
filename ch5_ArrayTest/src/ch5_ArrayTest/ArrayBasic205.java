
package ch5_ArrayTest;

public class ArrayBasic205 {

	public static void main(String[] args) {
	
//		구구단
		
//		2단만 구현한다
		
//		결과값을 배열에 저장하고
//		출력할 때 활용하시오
			
//			변수 배열
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		,,,
//		2 * 9 = 18
		
//		데이터베이스
		int[] numArr = new int [9];
		
//		결과값
		for (int i = 0; i < 9; i++) {
			numArr[i]=2*(i+1);
		}
//		출력
		for (int i = 0; i < 9; i++) {
			System.out.println((i+1)+ "번: 2 * " + (i+1) + " = " + numArr[i]);
		}
		
	}

} 
