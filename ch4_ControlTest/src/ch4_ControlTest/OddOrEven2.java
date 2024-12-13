
package ch4_ControlTest;

import java.util.Scanner;

public class OddOrEven2 {
	
	public static void main(String[] args) {

//		홀짝 맞추는 게임
//		조건 입력값과 결과값이 같을 때 승
		
		Scanner scan = new Scanner(System.in);
		String stringNum = "";
		System.out.println("홀/짝 중 하나를 골라 입력하세요");
		stringNum = scan.nextLine();
		System.out.println("입력한 값: " + stringNum);
		
		int random = 0;
		String result = "";
		
		random = (int)(Math.random() * 100);
		
		if (random % 2 == 0) {
			result = "짝";
		}else if (random % 2 != 0){
			result = "홀";
		}
		
		System.out.println("홀짝: " + result);
		
		if (result.equals(stringNum)) {
			System.out.println("나온 숫자: " + random);
			System.out.println("승패: 승!");
		}else if (result != stringNum) {
			System.out.println("나온 숫자: " + random);
			System.out.println("승패: 패!");
		}
		

	}
	
}

