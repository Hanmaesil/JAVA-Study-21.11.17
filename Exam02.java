
public class Exam02 {

	public static void main(String[] args) {
		//����ȯ(type casting) - �ڷ����� ��ȯ��Ų��.
		
		//�ڵ� ����ȯ(a.k.a ��Ʈ���ī!)
		int num1 = 30;
		long num2 = num1;
		
		//���� ����ȯ - �� �տ� (�ڷ���) �ִ´�
		int num3 = 200;
		byte num4 = (byte)num3; //ex)������ ������ �տ� (short) , ���� ����ȯ�� �����Ͱ� ���ǵȴ�.
		//System.out.println(num4);
		
		//������ �Ǽ� : ���� Ÿ���̶� �Ǽ��� �� ũ�� �ν��Ѵ�.
		int num5 = 50;
		float num6 = num5;
		int num7 = (int)num6;
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
		long num8 = 50;
		double num9 = num8;
		long num10 = (long)num9;
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
				
				
		
	}

}
