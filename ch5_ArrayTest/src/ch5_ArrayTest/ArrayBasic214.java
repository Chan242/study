// 2차원 배열 만들기
package ch5_ArrayTest;

public class ArrayBasic214 {

	public static void main(String[] args) {
	
//		2차원 배열을 활용해서
//		2행 3열 크기에 숫자들을
//		1행에 1들만
//		2행에 2들만 입력하고 출력하시오
		
		int[][] numArr = new int[2][3];
		
		numArr[0][0] = 1;
		numArr[0][1] = 1;
		numArr[0][2] = 1;
		numArr[1][0] = 2;
		numArr[1][1] = 2;
		numArr[1][2] = 2;
	
//		System.out.println(numArr[0][0]);
//		System.out.println(numArr[0][1]);
//		System.out.println(numArr[0][2]);
//		System.out.println(numArr[1][0]);
//		System.out.println(numArr[1][1]);
//		System.out.println(numArr[1][2]);
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[0].length; j++) {
				System.out.print(numArr[i][j] + "\t");
			}
			System.out.println();
			
		}
		
	}

} 
