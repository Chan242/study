
// 조건문 if-else-if-else문
package ch4_ControlTest;

import java.util.Scanner;

public class ControlTest141 {
	
	public static void main(String[] args) {

//		학점을 구해주는 프로그램을 구현하시오
		
//		키보드 입력으로 학점을 받는다
		 
//		점수가
//		100점 이하 90점 이상은 A
//		89점 이하 80점 이상은 B
//		79점 이하 70점 이상은 C
//		그 외 나머지 점수는 F
		
//		출력형태
//		89점은 B학점입니다
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("학점을 입력해주세요.");
		num = scan.nextInt();
			
		if (num <= 100 && num >=90) {
			System.out.println(num + "점은 A학점입니다.");
		}else if (num <= 89 && num >=80) {
			System.out.println(num + "점은 B학점입니다.");
		}else if (num <= 79 && num >=70) {
			System.out.println(num + "점은 c학점입니다.");
		}else if (num >= 0 && num < 70) {
			System.out.println(num + "점은 F학점입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	
		
	
	}
}

