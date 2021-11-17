package 조건문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//실습 : 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int answer = num%10;
		
		if(answer >= 5) {
			System.out.println("반올림 수 : " + ((num/10) * 10 + 10) );
		}else {
			System.out.println("반올림 수 : " + (num - answer));
		}
		
		/* if(num%10>=5) {
			System.out.println((num+10)-num%10); >>10증가 1의 자리 제거
		}else {
			System.out.println(num-(num%10)); >>1의 자리 제거
		} */
		
		
		
	}

}
