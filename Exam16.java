import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		//�ǽ� : �⺻�ñ��� 5000���̰� 8�ð� ���� ��� �ñ��� 1.5�踦 å�����ݴϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int tPay = 5000;
		int basicPay = 8 * tPay;
		double overPay = 5000 * 1.5;
		int overTime = time - 8;
		
		double pay1 = basicPay + overTime * overPay;
		int pay2 = time * tPay;
		
		//int pay = (int)(time > 8 ? pay1 : pay2);
		
		//System.out.println("�� �ӱ��� " + pay + "�� �Դϴ�.");
		
		//����Ǯ��
		//int time = sc.nextInt(); 
		//int money = time<8? time*5000 : (8*5000+(time-8)*7500)
		//System.out.println("�ñ� : " + money);
		
		//if else������ �ٲٱ�.
		
		if(time > 8) {
			System.out.println(pay1);
		}else {
			System.out.println(pay2);
		}
		
		//����Ǯ��
		/*int money = 0;
		if(time<8) {
			money = time*5000
		}else {
			money = (8*5000+(time-8)*7500)
		}
		System.out.println("�ñ� : " + money); */
	}

}
