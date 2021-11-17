import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		//실습 : 기본시급은 5000원이고 8시간 넘을 경우 시급의 1.5배를 책정해줍니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("노동시간을 입력하세요 : ");
		int time = sc.nextInt();
		int tPay = 5000;
		int basicPay = 8 * tPay;
		double overPay = 5000 * 1.5;
		int overTime = time - 8;
		
		double pay1 = basicPay + overTime * overPay;
		int pay2 = time * tPay;
		
		//int pay = (int)(time > 8 ? pay1 : pay2);
		
		//System.out.println("총 임금은 " + pay + "원 입니다.");
		
		//문제풀이
		//int time = sc.nextInt(); 
		//int money = time<8? time*5000 : (8*5000+(time-8)*7500)
		//System.out.println("시급 : " + money);
		
		//if else문으로 바꾸기.
		
		if(time > 8) {
			System.out.println(pay1);
		}else {
			System.out.println(pay2);
		}
		
		//문제풀이
		/*int money = 0;
		if(time<8) {
			money = time*5000
		}else {
			money = (8*5000+(time-8)*7500)
		}
		System.out.println("시급 : " + money); */
	}

}
