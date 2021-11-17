import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		
		//실습 : 상자하나에 농구공이 5개 들어갈 때, 농구공이 23개라면 필요한 상자개수를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		//String box = "필요한 상자의 수 :";
//		boolean result = ball%5 == 0;
//		
//		System.out.println(result ? box + (ball/5) : box + (ball/5 + 1));
		
		int box = ball%5 == 0 ? ball/5 : ball/5 + 1;
		System.out.println("필요한 박스의 갯수 : " + box);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
