package com.pineone.icbms.so.onem2m.service;

import com.pineone.icbms.so.domain.DeviceControlMessage;
import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-10-01.
 */
@Service
public class OneM2MService
{

	/**
	 * SI연동 데이터 규격으로 데이터 변경 처리 하는 서비스<BR/>
	 *
	 */

	/**
	 * create oneM2MMessage
	 * 
	 * @param physicaloperator
	 * @return SI연동 data로 변경.
	 */
	public DeviceControlMessage oneM2MCreateMessage(String physicaloperator)
	{

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
