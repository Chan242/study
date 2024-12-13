
// 조건문 if-else-if
package ch4_ControlTest;

import java.util.Scanner;

public class ControlTest140 {
	
	public static void main(String[] args) {

//		양수와 음수, 0을 구하는
//		프로그램을 구현하시오
		
//		출력형태
//		1인 경우
//		1 - 양수
//		
//		-30인 경우
//		-30 - 음수
//		
//		0인 경우
//		0 - 0 이라고 출력하시오
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하시오.");
		num = scan.nextInt();
		
		if(num == 0) {
			System.out.println(num + " - 0");
		}else if(num > 0) {
			System.out.println(num + " - 양수");
		}else if(num < 0) {
			System.out.println(num + " - 음수");
		} 
		
	}

}