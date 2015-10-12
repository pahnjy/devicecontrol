package com.pineone.icbms.so.service;

import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-10-12.
 */
@Service
public class IDeviceDriver implements DeviceDriver
{
	@Override
	public String messageDataMapping(String device, String operator)
	{
		// device와 operator를 가지고 physical operator를 만든다.

		return "homeiot.herit.net/csebase/container001/ci00/on";
	}
}
