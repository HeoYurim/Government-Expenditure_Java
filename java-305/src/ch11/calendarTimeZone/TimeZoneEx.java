package ch11.calendarTimeZone;

import java.util.*;

public class TimeZoneEx {

	public static void main(String[] args) {
		//�ڹٰ� �˰� �ִ� Ÿ������ ���Ѵ�.
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}

}
