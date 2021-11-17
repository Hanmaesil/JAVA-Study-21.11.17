import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 키보드로부터 데이터 입력받기

		Scanner sc = new Scanner(System.in); // ctrl + shift + o 스캐너 단축기
//		System.out.print("숫자를 입력해주세요 >> ");
//		int input = sc.nextInt(); // 숫자 입력받는 명령어.
//		System.out.println("결과 : " + input); // ctrl + shift + f 는 자동정렬 단축키
		
		
		//실습 : 어떤 값을 입력하든지 백의자리 아래 값을 버리고 출력하시오
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int result = input / 100;
		System.out.println("출력 : " + result * 100); //어떤 숫자든 100으로 나누면 100 아래 숫자는 떨어진다.
		System.out.println("출력 : " + result +"00");
		

	}

}
