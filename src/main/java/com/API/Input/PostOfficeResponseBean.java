package com.API.Input;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOfficeResponseBean {
	
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostOfficeDetailBean> PostOffice;

}
