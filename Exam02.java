
public class Exam02 {

	public static void main(String[] args) {
		//형변환(type casting) - 자료형을 변환시킨다.
		
		//자동 형변환(a.k.a 마트료시카!)
		int num1 = 30;
		long num2 = num1;
		
		//강제 형변환 - 값 앞에 (자료형) 넣는다
		int num3 = 200;
		byte num4 = (byte)num3; //ex)강제로 넣을때 앞에 (short) , 강제 형변환시 데이터가 유실된다.
		//System.out.println(num4);
		
		//정수와 실수 : 같은 타입이라도 실수를 더 크게 인식한다.
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
