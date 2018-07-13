package com.fbzs.utils;

import java.util.Date;

public class DateUtils {

	private static long day;
//	private static long hour;
//	private static long min;
//	private static long s;

	public static long getDateDifference(Date time_1, Date time_2) {
		try {
			long l = time_1.getTime() - time_2.getTime();
			day = l / (24 * 60 * 60 * 1000);
//			hour = (l / (60 * 60 * 1000) - day * 24);
//			min = (l / (60 * 1000) - day * 24 * 60 - hour * 60);
//			s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return day;

	}


}
