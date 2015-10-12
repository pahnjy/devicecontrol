package com.pineone.icbms.so.controller;

import com.pineone.icbms.so.domain.ResponseMessage;
import com.pineone.icbms.so.domain.VirtualDeviceControlMessage;
import com.pineone.icbms.so.domain.DeviceControlMessage;
import com.pineone.icbms.so.onem2m.service.IOneM2MService;
import com.pineone.icbms.so.service.*;
import com.pineone.icbms.so.onem2m.service.OneM2MService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by use on 2015-10-01.
 */
public interface DeviceController
{
	void controlMessage(@RequestBody VirtualDeviceControlMessage message);
}
