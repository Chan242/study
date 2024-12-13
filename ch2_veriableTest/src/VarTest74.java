
//형변환 두 숫자를 교체하시오
import java.util.Scanner;

public class VarTest74 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("실수를 하나 입력해주세요:");
		double num = 0.0;
		num = scan.nextDouble();
		int number = 0;
		number = 100;

		System.out.println("입력한 실수: "+num);
		System.out.println("number: "+number);
		
		int temp = 0;
		temp = (int)num;
		num = (double)number;
		number = temp;
		
		System.out.println("변환된 실수: "+num);
		System.out.println("변환된 number: "+number);
		
		

//		double d = 85.464;
//		int scoreNum;
//		
//		scoreNum = (int)d;
//		System.out.println(d);
//		System.out.println(scoreNum);
		
//		실수 하나를 키보드 입력을 받는다
		
//		int num = 0;
//		
//		num =100;
		
//		서로 값이 좀 달라진다고 쳐도 일단 그냥 두 숫자가 바뀌어서 출력되면 성공이다
		
//		num 23
//		??? 100.0
		
		
	}

}
