import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// �ǽ�
		// �ʸ� �Է� �޾� ��,��,�� ���·� ����ϼ���

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
		int hour = totalSecond / 3600;
		int minute = (totalSecond % 3600) / 60;
		int sec = (totalSecond % 3600) % 60;
		
		String result = hour + "�� " + minute + "�� " + sec + "��";

		System.out.println(result);

	}

}
