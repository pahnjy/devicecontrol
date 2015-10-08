package com.pineone.icbms.so.controller;

import com.pineone.icbms.so.domain.VirtualDeviceControlMessage;
import com.pineone.icbms.so.domain.DeviceControlMessage;
import com.pineone.icbms.so.service.DataService;
import com.pineone.icbms.so.onem2m.service.OneM2MService;
import com.pineone.icbms.so.service.ClientService;
import com.pineone.icbms.so.service.DeviceDriver;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by use on 2015-10-01.
 */
@Controller
public class DeviceControl
{

	@Autowired
	DeviceDriver deviceDriver;

	@Autowired
	OneM2MService oneM2MService;

	@Autowired
	ClientService clientService;

	@RequestMapping(value = "/so/controlmessage", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public void controlMessage(@RequestBody VirtualDeviceControlMessage message)
	{

		String physicalOperator = deviceDriver
				.messageDataMapping(message.getDevice(), message.getOperator());
		DeviceControlMessage oneM2MMessage = oneM2MService
				.oneM2MCreateMessage(physicalOperator);
		System.out.println(oneM2MMessage.toString());
		System.out.println("start");
		// json으로 파싱 처리 하기.
		HttpResponse response = clientService.requestPostData(
				ClientService.SIDEVICECONTROL,
				DataService.dataParsing(oneM2MMessage));

		// response 처리 방법?

	}

}
