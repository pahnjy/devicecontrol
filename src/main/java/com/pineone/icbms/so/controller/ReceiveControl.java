package com.pineone.icbms.so.controller;

import com.pineone.icbms.so.domain.ResponseMessage;
import com.pineone.icbms.so.domain.ResultMessage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by use on 2015-10-05.
 */
@Controller
public class ReceiveControl
{

	@RequestMapping(value = "/so/resources/pdcm/{id}", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public ResponseMessage controlMessage(@RequestBody ResultMessage message,
			@PathVariable String id)
	{

		// ResultMessage 받아서 DB에 결과값 update 및 결과 내용 responseMessage에 담아서 전달.

		// DB Update process
		// ResponseMessage responseMessage = DB.update();
		// .....



		ResponseMessage responseMessage = new ResponseMessage();

		// response 데이터 처리 service가 필요 할듯.

		return responseMessage;
	}

}
