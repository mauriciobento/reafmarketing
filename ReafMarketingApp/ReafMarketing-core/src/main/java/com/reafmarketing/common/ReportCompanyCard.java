package com.reafmarketing.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCompanyCard", propOrder = { 
		"report" 
		})
public class ReportCompanyCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2921279510243029795L;
	
	@XmlElement(name = "Report")
	private List<ReportCompanyCardDetail> report;

	public List<ReportCompanyCardDetail> getReport() {
		return report;
	}

	public void setReport(List<ReportCompanyCardDetail> report) {
		this.report = report;
	}

	@Override
	public String toString() {
		return "ReportCompanyCard [report=" + report + "]";
	}
	

}
