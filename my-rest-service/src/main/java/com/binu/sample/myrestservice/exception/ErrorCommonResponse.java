package com.binu.sample.myrestservice.exception;

import java.util.Date;

public class ErrorCommonResponse {

	private Date errorTimeStamp;
	private String errorMessage;
	private String detailedErrorMessage;
	
	public ErrorCommonResponse() {
	}
	
	public ErrorCommonResponse(Date errorTimeStamp, String errorMessage, String detailedErrorMessage) {
		super();
		this.errorTimeStamp = errorTimeStamp;
		this.errorMessage = errorMessage;
		this.detailedErrorMessage = detailedErrorMessage;
	}
	public Date getErrorTimeStamp() {
		return errorTimeStamp;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getDetailedErrorMessage() {
		return detailedErrorMessage;
	}
	public void setErrorTimeStamp(Date errorTimeStamp) {
		this.errorTimeStamp = errorTimeStamp;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setDetailedErrorMessage(String detailedErrorMessage) {
		this.detailedErrorMessage = detailedErrorMessage;
	}
	
}
