
package ch4_ControlTest;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String[] args) {

//		3의 배수인지 아닌지 구별하는 프로그램
//		10 -> 3의 배수가 아니다
//		9 ->3의 배수이다
		
//		x를 3으로나눠 나머지가없으면3의배수 .. 음 모르겟다
		
		
		
//		Scanner scan = new Scanner(System.in);
//		int x = 0;
//	
//		System.out.println("숫자 하나를 입력하세요");
//		x = scan.nextInt();
//		
//		if (x % 3 == 0 && x !=0) {
//			System.out.println("3의 배수이다");
//		}else {
//			System.out.println("3의 배수가 아니다");
//		}
		
		int random = 0;
		
		random = (int)(Math.random() * 100);
		
		System.out.println("숫자: " + random);
		
		if (random % 3 == 0 && random !=0) {
			System.out.println("3의 배수이다");
		}else {
			System.out.println("3의 배수가 아니다");
		}
		
		
		
//		홀짝 판별 프로그램
//		사용자의 입력을 받아서 홀인지 짝인지 맞추는 프로그램
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("숫자 하나를 입력하세요");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}
	
}

