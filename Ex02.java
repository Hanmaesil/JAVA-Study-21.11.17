package ���ǹ�;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//�ܼ� if��
		// �ǽ� : intŸ���� ���� age�� �����ϰ� Ű����� �Է¹����ÿ�
		// ���� age�� 20���� ũ�ų� ���ٸ� " �����Դϴ�" ���

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();

		if (age >= 20) {			//���๮���� �ϳ��� ��쿡�� �߰�ȣ ���� ����.
			System.out.println("�����Դϴ�.");
			// ���� 20���� �۴ٸ� "�̼����� �Դϴ�." ��� >>>> else if��	
		}else{
			System.out.println("�̼����� �Դϴ�.");
		}
		
		//else if��
		if(age<10) {
			System.out.println("10�� �̸��Դϴ�.");
		}
		else if(age >= 10 && age <20) {
			System.out.println("10���Դϴ�.");
		}
		else if(age >= 20 && age <30) {
			System.out.println("20���Դϴ�.");
		}
		else if(age >= 30 && age <40) {
			System.out.println("30���Դϴ�.");
		}
		else{
			System.out.println("30�� �̻��Դϴ�.");
		}
		System.out.println("�����ϼ̽��ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
