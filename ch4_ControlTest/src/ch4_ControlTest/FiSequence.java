package ch4_ControlTest;

import java.util.Scanner;

public class FiSequence {
	
	public static void main(String[] args) {
	
		/**
		 * @author user
		 * 
		 * 키보드로부터 정수를 입력받아서 그 수까지의 
		 * 피보나치 수열을 출력하는 프로그램을 작성하시오.
		 * 예1: 5입력 -> 출력: 0 1 1 2 3 
		 * 예2: 10입력 -> 0 1 1 2 3 5 8 13 21 34
		 */
		
			
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하시오.");
		
		int num = 0;
		int temp1 = 1;
		int temp2 = 0;
		int temp3 = 0;
		
		num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			temp3=temp1+temp2;
//			0 0 0
//			1 1 0
//			1 0 1
//			
			System.out.print(" " + temp3 + " ");		
//			0
//			1
//			1
			temp1 = temp2;
//			0 0
//			0 0
//			1 1
			temp2=temp3;
//			0 0
//			1 1
//			1 1
		}
		
	}

}
