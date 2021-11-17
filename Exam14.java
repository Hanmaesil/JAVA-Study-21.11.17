import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {

		// 실습 : 두개의 정수를 입력받아 큰수에서 작은수를 뺀 결과값을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		boolean num3 = num1 >= num2;
		System.out.println(num3 ? "두수의 차 : " + (num1 - num2) : "두수의 차 : " + (num2 - num1));
		
		System.out.println(num3);
		
		
	}

}
