package hany.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
//		switch (month) {
//		case 2:
//			return 28;
//		case 4:
//			return 30;
//		default:
//			return 31;
//		}
		return MAX_DAYS[month -1];
	}

	public void printSampleCalendat() {
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		// 월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램 작성하기
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();

		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));

		cal.printSampleCalendat();
		scanner.close();
	}

}
