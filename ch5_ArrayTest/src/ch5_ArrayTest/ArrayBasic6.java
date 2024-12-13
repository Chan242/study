package ch5_ArrayTest;

/**
 * @author PSU
 *  5개의 숫자를 배열에 입력한 후
 *	배열에 담은 값을 순차적으로 출력하시오
출력예시
10
20
30
40
50
 */
public class ArrayBasic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int [5];
//		int temp = 0;
		
//		#1
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		
//		#2-1
		for (int i = 0; i < 5; i++) {
//			temp++;
//			num[i] = temp*10;
			num[i] = (i+1)*10;
			System.out.println(num[i]);
		}
		
//		#2-2
//		for (int i = 0; i < num.length; i++) {
//			temp++;
//			num[i] = temp*10;
//			System.out.println(num[i]);

//		#3
//		int[] num = {10, 20, 30, 40, 50};
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
	}

}
