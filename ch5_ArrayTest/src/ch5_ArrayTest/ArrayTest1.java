package ch5_ArrayTest;

public class ArrayTest1 {
	public static void main(String[] args) {

//		배열에 
//		20, 40, 60, 80, 100, 13점을 넣고
//		
//		총점과 평균점수를 구하시오 
//		(평균의 경우 소수점 3번째 자리에서 반올림한다)
//		
//		총점: 313
//		평균: 52.166666,,,
//		평균 반올림: 52.17
		
//		평균.. .총점 / 6..?score.length
		
//		int[] score = new int [6];
		int[] scoreArr = {20, 40, 60, 80, 100, 13};
//		int num = 0;
		int sum = 0;
		double ave = 0;
		double round = 0;
//		score[5] = 13;
		
//		for (int i = 0; i < 5 ; i++) {
//			num = num +20;
//			score[i] = num;
//		}
		
		for (int i = 0; i < scoreArr.length; i++) {
			sum = sum + scoreArr[i];
		}
		System.out.println("총점: " + sum);
		
		ave = (double)sum / scoreArr.length ;
		System.out.println("평균: " + ave);
		
		round = (int)((ave*100) + 0.5)/100.0;
		System.out.println("평균 반올림: " + round); 
	}
}
