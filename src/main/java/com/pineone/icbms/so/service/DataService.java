package com.pineone.icbms.so.service;

import com.pineone.icbms.so.domain.ResponseMessage;
import net.sf.json.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by use on 2015-10-07.
 */
@Service
public class DataService
{

    public static final String RESPONSE_CODE = "code";
    public static final String RESPONSE_MESSAGE = "message";
    public static final String RESPONSE_CONTENT = "content";

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

    public static ResponseMessage responseDataParsing(HttpResponse response){

        HttpEntity entity = response.getEntity();
        String responseString = null;
        try {
            responseString = EntityUtils.toString(entity, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(responseString);

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject =  new JSONObject();
        try {
            jsonObject = (JSONObject)jsonParser.parse(responseString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(" response string\n");
        System.out.println(responseString);


        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode((String)jsonObject.get(RESPONSE_CODE));
        responseMessage.setMessage((String) jsonObject.get(RESPONSE_MESSAGE));
        responseMessage.setContent((String)jsonObject.get(RESPONSE_CONTENT));

        return responseMessage;
    }

}
