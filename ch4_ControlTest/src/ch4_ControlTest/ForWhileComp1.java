
//반복문 - for문 while문 차이
package ch4_ControlTest;

public class ForWhileComp1 {
	
	public static void main(String[] args) {
		
//		for문으로만 구현
//		1부터 100까지 전부 더하는데
//		짝수만 더한다
		
//		누적합: ???
		
		int x = 0;
		
		for (int i = 0; i <= 100; i++) {
			if(i%2 == 0) {
				x = x+i;
			}
		}System.out.println("누적합: " + x);
		
	}

}
