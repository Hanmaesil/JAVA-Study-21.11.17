package ���ǹ�;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//�ǽ� : ������ �Է¹޾� 1�� �ڸ����� �ݿø� �� ����� ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int answer = num%10;
		
		if(answer >= 5) {
			System.out.println("�ݿø� �� : " + ((num/10) * 10 + 10) );
		}else {
			System.out.println("�ݿø� �� : " + (num - answer));
		}
		
		/* if(num%10>=5) {
			System.out.println((num+10)-num%10); >>10���� 1�� �ڸ� ����
		}else {
			System.out.println(num-(num%10)); >>1�� �ڸ� ����
		} */
		
		
		
	}

}
