package 조건문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//단순 if문
		//정답 맞추기.
		Scanner sc = new Scanner(System.in);
		
		int answer = 10;
		
		System.out.print("정답을 입력해주세요 : ");
		int user = sc.nextInt();
		
		//만약 사용자가 10을 입력했다면 "정답입니다" 출력 후 "프로그램 종료" 출력.
		//정답을 맞추지 못했다면 "프로그램 종료" 출력.
		
		if(user == answer) {
			System.out.println("정답입니다.");
		}
			System.out.println("프로그램 종료.");
		
		
		
		
		
		
		
		
		
	}

}
