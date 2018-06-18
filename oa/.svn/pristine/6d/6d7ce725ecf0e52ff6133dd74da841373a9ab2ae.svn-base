package com.myoa.global.jsondate;

import com.myoa.util.DateFormat;

import java.io.IOException;
import java.util.Date;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class DateSerializerHMS extends JsonSerializer<Date> {
	public void serialize(Date o, JsonGenerator jsonGenerator,
			SerializerProvider serializerProvider) throws IOException,
			JsonProcessingException {
		try {
			String date = DateFormat.getFormatByUse("HH:mm:ss", o);
			jsonGenerator.writeString(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
