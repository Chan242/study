
// 반복문 - for
package ch4_ControlTest;

import java.util.Scanner;

public class ControlTest160 {
	
	public static void main(String[] args) {

//		구구단1
		
//		키보드로 구구단 단수를 입력받는다
//		2를 입력받으면
		
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		,,,
//		2 * 9 = 18
		 
//		이라고 출력하시오
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int result = 0;
		
		System.out.println("구구단 단수를 입력하시오");
		x = scan.nextInt();
		
		for(int num = 1;num < 10; num++) {
			result = x * num;
			System.out.println(x + " * " + num + " = " + result);
		}
	}
}

