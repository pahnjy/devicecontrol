package com.pineone.icbms.so.domain;

/**
 * Created by use on 2015-10-01.
 */
public class VirtualDeviceControlMessage
{
	String	id;
	String	devicename;
	String	operator;
	String	value;

	public VirtualDeviceControlMessage()
	{
	}

	public VirtualDeviceControlMessage(String id, String devicename,
			String operator, String value)
	{
		this.id = id;
		this.devicename = devicename;
		this.operator = operator;
		this.value = value;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getDevicename()
	{
		return devicename;
	}

	public void setDevicename(String devicename)
	{
		this.devicename = devicename;
	}

	public String getOperator()
	{
		return operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}
}
