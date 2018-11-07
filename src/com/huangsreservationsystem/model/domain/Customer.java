package com.huangsreservationsystem.model.domain;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 7661657477853633935L;

	/** Customer last name */
	private String lastName;

	/** Customer first name */
	private String firstName;

	/** Customer email address */
	private String emailAddress;

	/** Customer password */
	private String password;

	/** Customer day phone */
	private String dayTimePhone;

	/** Customer evening phone */
	private String eveningTimePhone;

	private static final String TAB = "    ";

	/**
	 * Default constructor
	 */
	public Customer() {
	}

	/**
	 * Copy constructor
	 * 
	 * @param customer
	 */
	public Customer(Customer customer) {
		this.lastName = customer.lastName;
		this.firstName = customer.firstName;
		this.emailAddress = customer.emailAddress;
		this.password = customer.password;
		this.dayTimePhone = customer.dayTimePhone;
		this.eveningTimePhone = customer.eveningTimePhone;
	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param emailAddress
	 */
	public Customer(String lastName, String firstName, String emailAddress, String password, String dayTimePhone,
			String eveningTimePhone) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		this.password = password;
		this.dayTimePhone = dayTimePhone;
		this.eveningTimePhone = eveningTimePhone;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 *  Set the email address.
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the dayTimePhone
	 */
	public String getDayTimePhone() {
		return dayTimePhone;
	}

	/**
	 * @param dayTimePhone the dayTimePhone to set
	 */
	public void setDayTimePhone(String dayTimePhone) {
		this.dayTimePhone = dayTimePhone;
	}

	/**
	 * @return the eveningTimePhone
	 */
	public String getEveningTimePhone() {
		return eveningTimePhone;
	}

	/**
	 * @param eveningTimePhone the eveningTimePhone to set
	 */
	public void setEveningTimePhone(String eveningTimePhone) {
		this.eveningTimePhone = eveningTimePhone;
	}

	/**
	 * 
	 * @return true if non of those are null
	 */
	public boolean validate() {
		if (lastName == null)
			return false;
		if (firstName == null)
			return false;
		if (emailAddress == null)
			return false;
		if (password == null)
			return false;
		if (dayTimePhone == null)
			return false;
		if (eveningTimePhone == null)
			return false;

		return true;
	}

	/**
	 * 
	 * @param Customer
	 * @return
	 */
	public boolean equals(Customer customer) {
		if (!lastName.equals(customer.getLastName()))
			return false;
		if (!firstName.equals(customer.getFirstName()))
			return false;
		if (!emailAddress.equals(customer.getEmailAddress()))
			return false;
		if (!password.equals(customer.getPassword()))
			return false;
		if (!dayTimePhone.equals(customer.getDayTimePhone()))
			return false;
		if (!eveningTimePhone.equals(customer.getEveningTimePhone()))
			return false;

		return true;
	}

	/**
	 * change the customer object into a string.
	 * @return String
	 */
	public String toString() {

		String returnValue = "";

		returnValue = "Customer ( " + super.toString() + TAB + "lastName = " + this.lastName + TAB + "firstName = "
				+ this.firstName + TAB + "emailAddress = " + this.emailAddress + TAB + "password = " + this.password
				+ TAB + "dayTimePhone = " + this.dayTimePhone + TAB + "eveningTimePhone = " + this.eveningTimePhone
				+ TAB + " )";

		return returnValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((dayTimePhone == null) ? 0 : dayTimePhone.hashCode());
		return result;
	}
}
