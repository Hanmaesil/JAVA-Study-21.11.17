import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 실습
		// 초를 입력 받아 시,분,초 형태로 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		int hour = totalSecond / 3600;
		int minute = (totalSecond % 3600) / 60;
		int sec = (totalSecond % 3600) % 60;
		
		String result = hour + "시 " + minute + "분 " + sec + "초";

		System.out.println(result);

	}

}
