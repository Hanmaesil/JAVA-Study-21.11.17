package 조건문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//단순 if문
		// 실습 : int타입의 변수 age를 선언하고 키보드로 입력받으시오
		// 만약 age가 20보다 크거나 같다면 " 성인입니다" 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		if (age >= 20) {			//실행문장이 하나일 경우에는 중괄호 생략 가능.
			System.out.println("성인입니다.");
			// 만약 20보다 작다면 "미성년자 입니다." 출력 >>>> else if문	
		}else{
			System.out.println("미성년자 입니다.");
		}
		
		//else if문
		if(age<10) {
			System.out.println("10살 미만입니다.");
		}
		else if(age >= 10 && age <20) {
			System.out.println("10대입니다.");
		}
		else if(age >= 20 && age <30) {
			System.out.println("20대입니다.");
		}
		else if(age >= 30 && age <40) {
			System.out.println("30대입니다.");
		}
		else{
			System.out.println("30대 이상입니다.");
		}
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
