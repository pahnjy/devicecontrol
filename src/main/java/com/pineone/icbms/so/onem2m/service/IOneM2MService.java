package com.pineone.icbms.so.onem2m.service;

import com.pineone.icbms.so.domain.DeviceControlMessage;

/**
 * Created by use on 2015-10-12.
 */
public class IOneM2MService implements OneM2MService {
    @Override
    public DeviceControlMessage oneM2MCreateMessage(String physicaloperator) {

            DeviceControlMessage deviceControlMessage = new DeviceControlMessage();

            deviceControlMessage.set_uri("casebase/SAE_0021");
            deviceControlMessage.set_notificationUri(
                    "http://www.icbms.org:8080/so/resources/pdcm/cmd_0303");
            deviceControlMessage.set_command("switch_ctl");
            deviceControlMessage.setCnf("text/plain:0");
            deviceControlMessage.setCon(physicaloperator);

            return deviceControlMessage;

    }
}
