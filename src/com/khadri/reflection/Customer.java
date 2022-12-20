package com.khadri.reflection;

public class Customer {

	private String custId;
	private String custName;

	public Customer() {
		super();
	}

	public Customer(String custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public void orderService() {
		System.out.println("Customer Order Initiated!!!");
	}

}
