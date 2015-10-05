package com.pineone.so.domain;

/**
 * Created by use on 2015-10-05.
 */
public class ResponseMessage {

    String _commandId;
    String _resultCode;
    String _result;

    public ResponseMessage(String _commandId, String _resultCode, String _result) {
        this._commandId = _commandId;
        this._resultCode = _resultCode;
        this._result = _result;
    }

    public String get_commandId() {
        return _commandId;
    }

    public void set_commandId(String _commandId) {
        this._commandId = _commandId;
    }

    public String get_resultCode() {
        return _resultCode;
    }

    public void set_resultCode(String _resultCode) {
        this._resultCode = _resultCode;
    }

    public String get_result() {
        return _result;
    }

    public void set_result(String _result) {
        this._result = _result;
    }
}
