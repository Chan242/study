// 2차원 배열
package ch5_ArrayTest;

public class ArrayTest217 {

	public static void main(String[] args) {

//		1~24 를 순차적으로
//		2차원 배열에 넣는다
//		4행 6열
//		
//		이들을 중첩 for문을 활용해서
//		행열을 구분하여 출력한다
		
		int[][] numArr = new int[4][6];
		
//		for (int i = 0; i < numArr.length; i++) {
//			for (int n = 0; n < numArr[i].length; n++) {
//				numArr[i][n] = (i*6) + n + 1;
//				System.out.print(numArr[i][n] + "\t");
//				if(numArr[i][n]%6 ==0) {
//					System.out.println();
//				}
//			}
//		}
		
//		할당
		for (int i = 0; i < numArr.length; i++) {
			for (int n = 0; n < numArr[i].length; n++) {
				numArr[i][n] = (i*6) + n + 1;
			}
		}
		
//		출력
		for (int i = 0; i < numArr.length; i++) {
			for (int n = 0; n < numArr[i].length; n++) {
				System.out.print(numArr[i][n] + "\t");
				if(numArr[i][n]%numArr[0].length ==0) {
					System.out.println();
				}
			}
		}
		
	}

} 
