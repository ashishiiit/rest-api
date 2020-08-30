package com.ashish.RestAPiDemo.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	private int errorCode;
	private String errorMessgae;

	//when you create constructor with arguments then you must need to also create constructor with no-args.
	public ErrorMessage() {
	}

	public ErrorMessage(int errorCode, String errorMessgae) {
		super();
		this.errorCode = errorCode;
		this.errorMessgae = errorMessgae;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessgae() {
		return errorMessgae;
	}

	public void setErrorMessgae(String errorMessgae) {
		this.errorMessgae = errorMessgae;
	}

}
