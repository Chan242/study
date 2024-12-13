package ch5_ArrayTest;

public class ArrayTest197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		아래의 형태로 선언 및 초기화해서 문제를 구현하시오
//		int[] ??? = {};
		
//		79, 88, 91, 33, 100, 55, 95
//		값들이 존재할 때 가장 큰 수와 가장 작은 수를 찾아서 출력하시오
		
		int[] numArr = {79, 88, 91, 33, 100, 55, 95};
		
		int max = 0;
		int min = 0;
	
		max = numArr[0];
		min = numArr[0];
		
		for (int i = 0; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}else if(min > numArr[i]) {
				min = numArr[i];
			}
		}

		System.out.println("가장 큰 수: " + max);
		System.out.println("가장 작은 수: " + min);
	}

}
