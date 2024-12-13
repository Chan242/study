
// 조건문 실전
package ch4_ControlTest;

import java.util.Scanner;

public class ControlTest145_3 {
	
	public static void main(String[] args) {
//		사용자로부터 학점을 입력받는다
//		
//		90점 이상이면 A인데
//		98점 이상은 A+
//		94점 미만이면 A-
//		
//		80점도 동일하게
//		B
//		B+
//		B-를 구현한다
//		나머지 점수는 전부 C점수를 부여하시오
//		
//		출력형태
//		93점의 경우
//		당신의 학점은 93점
//		A-등급입니다
//
//		80점의 경우
//		당신의 학점은 80점
//		B-등급입니다
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String level = "";
		
		System.out.println("학점을 입력해주세요.");
		score = scan.nextInt();
		
		level = "당신의 학점은 " + score + "점\n";
		 
//		A학점 분류
		if (score >= 90) {
			if (score >=98) {
				level += "A+";
			}else if (score <=94) {
				level += "A-";
			}else {
				level += "A";
			}	
		}
//		B학점 분류
		else if (score >= 80) {
			if (score >=88) {
				level += "B+";
			}else if (score <= 84) {
				level += "B-";
			}else {
				level += "B";
			}		
		}
//		C학점 분류
		else {
			level += "C";
		}
		
		level += "등급입니다";
		
//		잘못된 입력 분류
		if (score > 100 || score < 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			System.out.println(level);
		}
	}
	
}

