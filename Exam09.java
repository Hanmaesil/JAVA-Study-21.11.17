
public class Exam09 {

	public static void main(String[] args) {
		//복합대입연산자
		int num = 10;
		
		//num = num + 2;
		//num += 2; //위랑 똑같은 코드
		//num -= 2; // num = num - 5, 대입연산자 앞에 다른 연산기호를 넣어도 된다.(+ - * / %)
		num -= 2 + 3 * 4; // num = num - (2 + 3 * 4); >> 대입연산자 후에 서술된것 먼저 처리한다.
		
		
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
