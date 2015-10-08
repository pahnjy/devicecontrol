package com.pineone.icbms.so.service;

import org.apache.http.HttpResponse;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by use on 2015-10-07.
 */
@Service
public class DataService
{

	public static String dataParsing(Object o)
	{
		ObjectMapper mapper = new ObjectMapper();
		String data = null;
		try
		{
			data = mapper.writeValueAsString(o);
		}
		catch (JsonProcessingException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return data;
	}

}
