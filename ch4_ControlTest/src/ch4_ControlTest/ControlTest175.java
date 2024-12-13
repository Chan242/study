
//반복문 - break문 활용
package ch4_ControlTest;

import java.util.Scanner;

public class ControlTest175 {
	
	public static void main(String[] args) {
		
//		사용자가 입력한 숫자를 모두 누적해서 계산하는
//		프로그램 구현
//		
//		사용자가 키보드로 입력한다
//		300
//		누적금액: 300
//
//		400
//		누적금액: 700
//		
//		1000
//		누적금액: 1700
//		
//		언젠가는 사용자가 0을 입력하면 최종금액을 출력하고 프로그램 종료
//		
//		0을 입력하면
//		3번 구매한 총 금액은 1700원 입니다.
//	
//		구매해 주셔서 감사합니다.
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int temp =0;
		int count = 0;
		
		while(true) {
			System.out.println("금액을 입력해주세요.");
			input = scan.nextInt();
			temp = input + temp;
			System.out.println("누적금액: " + temp);		
			
			if(input == 0) {
				System.out.println(count + "번 구매한 총 금액은 " + temp + "원 입니다.");
				break;
			}
			
			count++;
		}
		
		System.out.println("구매해 주셔서 감사합니다.");
		System.out.println("프로그램 종료");
	}

}
