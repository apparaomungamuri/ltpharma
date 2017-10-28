package com.lt.controller;


import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.mungamuri.dao.MysqlConnection;


@ManagedBean
@ViewScoped
public class ContactUsController implements Serializable {

	private String email;
	private String phoneNo;
	private String name;
	
	public void sendContactDetails() throws IOException {
		Connection connection=MysqlConnection.getConnection();
		System.out.println("ContactUsController :connection "+connection);
	}

	public void cancelCreateTestimonial() throws IOException {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
