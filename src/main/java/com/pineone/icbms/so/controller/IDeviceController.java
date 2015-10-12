package com.pineone.icbms.so.controller;

import com.pineone.icbms.so.domain.DeviceControlMessage;
import com.pineone.icbms.so.domain.ResponseMessage;
import com.pineone.icbms.so.domain.VirtualDeviceControlMessage;
import com.pineone.icbms.so.onem2m.service.OneM2MService;
import com.pineone.icbms.so.service.ClientService;
import com.pineone.icbms.so.service.DataService;
import com.pineone.icbms.so.service.DeviceDriver;
import com.pineone.icbms.so.service.IClientService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by use on 2015-10-12.
 */
@Controller
public class IDeviceController implements DeviceController
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
	@Override
	public void controlMessage(@RequestBody VirtualDeviceControlMessage message)
	{
		String physicalOperator = deviceDriver
				.messageDataMapping(message.getDevicename(), message.getOperator());
		DeviceControlMessage oneM2MMessage = oneM2MService
				.oneM2MCreateMessage(physicalOperator);

		HttpResponse response = clientService.requestData(
				IClientService.SIDEVICECONTROL,
				DataService.dataParsing(oneM2MMessage));
		ResponseMessage responseMessage = DataService
				.responseDataParsing(response);
		// responseMessage 결과값 확인 후 DB에 저장.
	}
}
