package com.pineone.icbms.so.service;

import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-10-01.
 */
public interface DeviceDriver
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
	String messageDataMapping(String device, String operator);

}
