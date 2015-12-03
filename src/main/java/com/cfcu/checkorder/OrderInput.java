package com.cfcu.checkorder;

import java.util.Date;

public class OrderInput {
	
    String customerName = "";
    String customerId="";
    Date orderDate= null;
    String contactPhone = "";
    String email = "";
    String account = "";
    int applyItem = 0;
    int orderType = 0;
    
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String polno) {
		this.account = account;
	}
	public int getApplyItem() {
		return applyItem;
	}
	public void setApplyItem(int applyItem) {
		this.applyItem = applyItem;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
    
    

}
