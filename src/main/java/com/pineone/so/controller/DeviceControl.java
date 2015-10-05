package com.pineone.so.controller;

import com.pineone.so.domain.DeviceControlMessage;
import com.pineone.so.domain.VirtualDeviceControlMessage;
import com.pineone.so.onem2m.service.OneM2MService;
import com.pineone.so.service.ClientService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by use on 2015-10-01.
 */
@Controller
public class DeviceControl {

    @Autowired
    DeviceDriver deviceDriver;

    @Autowired
    OneM2MService oneM2MService;

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/so/controlmessage", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public void controlMessage(@RequestBody VirtualDeviceControlMessage message){

        String physicalOperator = deviceDriver.messageDataMapping(message.getDevice(), message.getOperator());
        DeviceControlMessage oneM2MMessage = oneM2MService.oneM2MCreateMessage(physicalOperator);
        System.out.println(oneM2MMessage.toString());
        HttpResponse response = clientService.requestPostData(ClientService.SIDEVICECONTROL,oneM2MMessage);

        // response 처리 방법?

    }

}
