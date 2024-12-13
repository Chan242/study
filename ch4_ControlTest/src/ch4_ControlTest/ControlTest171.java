
//while문 분석
package ch4_ControlTest;

public class ControlTest171 {
	
	public static void main(String[] args) {
	
//		1 - 1
//		2 - 3
//		3 - 6 1+2+3
//		4 - 10
//		5 - 15
//		,
//		,
//		,
//		11 - 66
//		12 - 78
//		13 - 91
//		
//		로 출력하면 되는데
//		내용은 1부터 100까지 모든 수를 더하는데 최초로 100을 초과하기
//		전의 연산 과정을 출력하시오
		
//		===
//		int n = 0;
//		int result = 0;
//		
//		while(n < 100) {
//			n++;
//			result = n + result;
//			System.out.println(n + " - " + result);
//		}
		
//		===변수를 추가하는 방식
		
//		int n = 0;
//		int count = 1;
//		int result = 0;
//		
//		while(result < 100) {
//			n = n+count;
//			result = n+count;
//			System.out.println(count + " - " + n);
//			count++;
//		}
		
//		===if를 사용하는 방식
		
		int n = 0;
		int result = 0;
		
		while(n < 100) {
			n++;
			result = n + result;
			if(result <100) {
			System.out.println(n + " - " + result);
			}
		}
		
		
	}

}
