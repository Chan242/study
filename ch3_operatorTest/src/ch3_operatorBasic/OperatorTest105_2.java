// 반올림처리 구현하기

package ch3_operatorBasic;

public class OperatorTest105_2 {
	
	public static void main(String[] args) {

		double num = 3.145592;
		double resultNum = 0.0;
		
		
//		resultNum = (int)(num * 100) / 100.0;
	
		resultNum = num + 0.005;
		System.out.println(resultNum);	
		
		resultNum = resultNum * 100;
		System.out.println(resultNum);
		
		resultNum = (int)resultNum;
		System.out.println(resultNum);
		
		resultNum = resultNum / 100.0;
		System.out.println(resultNum);
//		System.out.println("소수점 3번째 자리에서 반올림 즉 2자리까지 출력");
//		System.out.println(num + "->" + resultNum);
		
		
	}

}
