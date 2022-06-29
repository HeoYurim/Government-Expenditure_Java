package ch11.calendarTimeZone;

import java.util.*;

public class TimeZoneEx {

	public static void main(String[] args) {
		//자바가 알고 있는 타임존을 구한다.
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}

}
