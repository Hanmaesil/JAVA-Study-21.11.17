import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		
		//�ǽ� : �����ϳ��� �󱸰��� 5�� �� ��, �󱸰��� 23����� �ʿ��� ���ڰ����� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int ball = sc.nextInt();
		//String box = "�ʿ��� ������ �� :";
//		boolean result = ball%5 == 0;
//		
//		System.out.println(result ? box + (ball/5) : box + (ball/5 + 1));
		
		int box = ball%5 == 0 ? ball/5 : ball/5 + 1;
		System.out.println("�ʿ��� �ڽ��� ���� : " + box);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
