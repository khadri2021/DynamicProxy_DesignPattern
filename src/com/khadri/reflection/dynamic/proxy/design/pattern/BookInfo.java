package com.khadri.reflection.dynamic.proxy.design.pattern;

public class BookInfo {

	private Double price;

	private String serviceNo;

	public BookInfo(Double price, String serviceNo) {
		super();
		this.price = price;
		this.serviceNo = serviceNo;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	@Override
	public String toString() {
		return "BookInfo [price=" + price + ", serviceNo=" + serviceNo + "]";
	}

}
