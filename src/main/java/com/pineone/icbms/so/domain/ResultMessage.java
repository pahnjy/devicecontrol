package com.pineone.icbms.so.domain;

/**
 * Created by use on 2015-10-05.
 */
public class ResultMessage
{

	String	_resultCode;
	String	_result;

	public ResultMessage(String _resultCode, String _result)
	{
		this._resultCode = _resultCode;
		this._result = _result;
	}

	public String get_resultCode()
	{
		return _resultCode;
	}

	public void set_resultCode(String _resultCode)
	{
		this._resultCode = _resultCode;
	}

	public String get_result()
	{
		return _result;
	}

	public void set_result(String _result)
	{
		this._result = _result;
	}
}
