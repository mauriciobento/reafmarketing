package com.reafmarketing.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyCard", propOrder = { 
		"name" 
		})
public class CompanyCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8449046097742397127L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CompanyCard [name=" + name + "]";
	}
	
	

}
