//로또 6자리 뽑기

package ch5_ArrayTest;

import java.util.Iterator;

public class ArrayBasic199 {

	public static void main(String[] args) {
		
//		1	2	3	4	5
//		6	7	8	9	10
//		11	12	13	14	15
//		16	17	18	19	20
//		21	22	23	24	25
//		,,,
//		41	42	43	44	45

		int[] ballArr = new int[45];
		
//		1~45 값 저장
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;
		}
		
//		내용 확인
		for (int i = 0; i < ballArr.length; i++) {
			System.out.print(ballArr[i] + "\t");
			if ((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		
//		두 값 변경하기 위해 만든 임시 변수
		int tempBall = 0;
//		배열의 인덱스에 임의 접근을 위한 변수
		int randNum = 0;
		
//		배열의 값들을 자리바꿈 하기 위한 로직
		for (int i = 0; i < 6; i++) {
			randNum = (int)(Math.random() * 45);
			tempBall = ballArr[i];
			ballArr[i] = ballArr[randNum];
			ballArr[randNum] = tempBall;
		}
		
//		for (int i = 0; i < 6; i++) {
//			System.out.print(ballArr[i] + "\t"); 
//		}
		
	}

} 
