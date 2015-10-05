package com.pineone.so.controller;

import com.pineone.so.domain.DeviceControlMessage;
import com.pineone.so.domain.ResponseMessage;
import com.pineone.so.domain.VirtualDeviceControlMessage;
import com.pineone.so.service.ClientService;
import org.apache.http.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by use on 2015-10-05.
 */
@Controller
public class ReceiveControl {

    @RequestMapping(value = "/so/responsemessage", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public void controlMessage(@RequestBody ResponseMessage message){

        // response data 팝아서 처리하기

    }


}
