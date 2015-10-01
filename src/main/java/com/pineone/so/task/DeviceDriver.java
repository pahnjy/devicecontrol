package com.pineone.so.task;

import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-10-01.
 */
@Service
public class DeviceDriver {


    /**
     *
     *
     * @param device device in VirtualDeviceControlMessage
     * @param operator opertor in VirtualDeviceControlMessage
     * @return physical operator
     */
    public String messageDataMapping(String device, String operator){

        return "templateOn";
    }

}
