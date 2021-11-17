import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		//실습 : 일의 자리 값을 1로 바꿔서 출력하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int result1 = num / 10 * 10 + 1;
		String result2 = num / 10 + "1";

		System.out.println("출력 : " + result1);
		System.out.println("출력 : " + result2);
		
		
		
		
		
		
		
		
		
		
	}

}
