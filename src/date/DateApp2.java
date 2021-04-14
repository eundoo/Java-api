package date;

import java.util.Calendar;
import java.util.Date;

public class DateApp2 {

	public static void main(String[] args) {
		//현재 날짜 및 시간정보를 포함하고 있는 Date객체 생성하기
		Date now = new Date();
		System.out.println(now);
		//현재 날짜 및 시간정보를 포함하고 있는 Calendar객체 생성하기
		Calendar cal = Calendar.getInstance();
		//이 Calendar는 추상이라서 new가 안됨
		System.out.println(cal);
		
		//특정 날짜와 시간정보를 포함하는 Calendar객체 생성하기
		Calendar cal2 = Calendar.getInstance();
		//2021년 4월 14일 11시 34분 10초에 해당하는 날짜 정보를 Calender에 설정
		cal2.set(1994, 11, 22, 11, 34, 10);
		System.out.println(cal2);
		
		//Calendar객체로부터 Date객체 조회하기
		Date date = cal2.getTime();
		System.out.println(date);

		//Calendar객체로부터 유닉스 타임 조회하기
		long unixTime = cal2.getTimeInMillis();
		System.out.println("유닉스 타임: " + unixTime);
		
		//유닉스타임 값으로 Date객체 생성하기
		Date date2 = new Date(0);
		System.out.println(date2);
		
	}

}
