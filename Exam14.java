import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {

		// �ǽ� : �ΰ��� ������ �Է¹޾� ū������ �������� �� ������� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		boolean num3 = num1 >= num2;
		System.out.println(num3 ? "�μ��� �� : " + (num1 - num2) : "�μ��� �� : " + (num2 - num1));
		
		System.out.println(num3);
		
		
	}

}
