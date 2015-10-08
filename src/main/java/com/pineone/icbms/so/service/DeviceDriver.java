package com.pineone.icbms.so.service;

import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-10-01.
 */
@Service
public class DeviceDriver
{

	/**
	 * virtual한 데이터를 가지고 physical 메시지로 변환
	 */

	/**
	 *
	 *
	 * @param device
	 *            device in VirtualDeviceControlMessage
	 * @param operator
	 *            opertor in VirtualDeviceControlMessage
	 * @return physical operator
	 */
	public String messageDataMapping(String device, String operator)
	{
		// device와 operator를 가지고 physical operator를 만든다.

		return "homeiot.herit.net/csebase/container001/ci00/on";
	}

}
