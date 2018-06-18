package com.myoa.global.converter;

import com.myoa.util.common.L;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<Date, String> {
	private final SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
	private final SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	private final SimpleDateFormat HHmmss = new SimpleDateFormat("HH:mm:ss");
	private final int leng_yyyyMMdd = 10;
	private final int leng_yyyyMMddHHmmss = 19;
	private final int leng_HHmmss = 8;

	public String convert(Date source) {
		L.w(new Object[] { "0=||=============>" });
		return this.yyyyMMddHHmmss.format(source);
	}
}
