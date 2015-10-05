package com.pineone.so.onem2m.service;

import com.pineone.so.domain.DeviceControlMessage;
import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-10-01.
 */
@Service
public class OneM2MService {

    /**
     * create oneM2MMessage
     * @param physicaloperator
     * @return SI연동 data로 변경.
     */
    public DeviceControlMessage oneM2MCreateMessage(String physicaloperator){

        DeviceControlMessage deviceControlMessage =  new DeviceControlMessage();

        deviceControlMessage.set_uri("casebase/SAE_0021");
        deviceControlMessage.set_notificationUri("http://si.herit.net:9090/noti1");
        deviceControlMessage.set_commandId("cmd_0303");
        deviceControlMessage.set_command("switch_ctl");
        deviceControlMessage.setCnf("text/plain:0");
        deviceControlMessage.setCon(physicaloperator);

        return deviceControlMessage;

    }


}
