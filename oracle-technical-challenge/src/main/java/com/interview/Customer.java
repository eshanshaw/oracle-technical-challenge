package com.interview;

public class Customer {
	
	String customerId;
	String contractId;
	String geozone;
	String teamcode;
	String projectcode;
	String buildduration;
	
	public Customer() {
		
	}
	
	public Customer(String customerId, String contractId, String geozone, String teamcode, String projectcode,
			String buildduration) {
		super();
		this.customerId = customerId;
		this.contractId = contractId;
		this.geozone = geozone;
		this.teamcode = teamcode;
		this.projectcode = projectcode;
		this.buildduration = buildduration;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getGeozone() {
		return geozone;
	}
	public void setGeozone(String geozone) {
		this.geozone = geozone;
	}
	public String getTeamcode() {
		return teamcode;
	}
	public void setTeamcode(String teamcode) {
		this.teamcode = teamcode;
	}
	public String getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}

	public String getBuildduration() {
		return buildduration;
	}
	public void setBuildduration(String buildduration) {
		this.buildduration = buildduration;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", contractId=" + contractId + ", geozone=" + geozone
				+ ", teamcode=" + teamcode + ", projectcode=" + projectcode + ", buildduration=" + buildduration + "]";
	}
	
	public Double getDurationValue() {
		int length = this.buildduration.length();
		String builddurationValue = this.buildduration.substring(0, length-1);
		return Double.parseDouble(builddurationValue);
	}


}
