import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// Ű����κ��� ������ �Է¹ޱ�

		Scanner sc = new Scanner(System.in); // ctrl + shift + o ��ĳ�� �����
//		System.out.print("���ڸ� �Է����ּ��� >> ");
//		int input = sc.nextInt(); // ���� �Է¹޴� ��ɾ�.
//		System.out.println("��� : " + input); // ctrl + shift + f �� �ڵ����� ����Ű
		
		
		//�ǽ� : � ���� �Է��ϵ��� �����ڸ� �Ʒ� ���� ������ ����Ͻÿ�
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		int result = input / 100;
		System.out.println("��� : " + result * 100); //� ���ڵ� 100���� ������ 100 �Ʒ� ���ڴ� ��������.
		System.out.println("��� : " + result +"00");
		

	}

}
