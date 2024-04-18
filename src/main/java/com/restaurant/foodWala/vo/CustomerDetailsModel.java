package com.restaurant.foodWala.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerDetailsModel {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int customerId;

	@Column
	public String customerFirstName;

	@Column
	public String customerLastName;

	@Column
	public String customerEmailId;

	@Column
	public long customerMobileNumber;
	
	public CustomerDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetailsModel(int customerId, String customerFirstName, String customerLastName,
			String customerEmailId, long customerMobileNumber) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmailId = customerEmailId;
		this.customerMobileNumber = customerMobileNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

}
