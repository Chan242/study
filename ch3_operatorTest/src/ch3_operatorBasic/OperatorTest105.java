// 올림처리 구현하기

package ch3_operatorBasic;

public class OperatorTest105 {
	
	public static void main(String[] args) {
//		3.141592
//		3.145592
//		3.149592
//		3.140592

		double num = 3.141592;
		double resultNum = 0.0;
		
		resultNum = (int)(num * 100 + 0.9) / 100.0;
						
		System.out.println("소수점 3번째 자리에서 올림 즉 2자리까지 출력");
		System.out.println(num + "->" + resultNum);
//		3.15
		
	}

}
