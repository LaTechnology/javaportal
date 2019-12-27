package com.erp.lt.portal.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.ParseException;
import org.springframework.util.StringUtils;

public class ERPPortalDateUtils {
	public static Date convertStringToDate(String releaseDate) {
		if (StringUtils.isEmpty(releaseDate)) {
			return null;
		}
		try {
			try {
				return DateUtils.parseDate(releaseDate, new String[] { "MM-dd-yyyy" });
			} catch (java.text.ParseException e) {
				e.printStackTrace();
			}
		} catch (ParseException e) {
			return null;
		}
		return null;
	}

	public static String convertDateToString(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		String strDate = formatter.format(date);
		System.out.println("Date Format with MM/dd/yyyy : " + strDate);
		return strDate;
	}
}
