package com.pineone.icbms.so.domain;

/**
 * Created by use on 2015-10-01.
 */
public class VirtualDeviceControlMessage
{
	String	id;
	String	device;
	String	operator;

	public VirtualDeviceControlMessage()
	{
	}

	public VirtualDeviceControlMessage(String id, String device,
			String operator)
	{
		this.id = id;
		this.device = device;
		this.operator = operator;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getDevice()
	{
		return device;
	}

	public void setDevice(String device)
	{
		this.device = device;
	}

	public String getOperator()
	{
		return operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}
}
