package com.reafmarketing.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCompanyCardDetail", propOrder = { 
		"companyCard",
		"total"
		})
public class ReportCompanyCardDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4766294065088746688L;

	@XmlElement(name = "CompanyCard")
	private CompanyCard companyCard;
	
	private int total;

	public CompanyCard getCompanyCard() {
		return companyCard;
	}

	public void setCompanyCard(CompanyCard companyCard) {
		this.companyCard = companyCard;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyCard == null) ? 0 : companyCard.hashCode());
		result = prime * result + total;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReportCompanyCardDetail other = (ReportCompanyCardDetail) obj;
		if (companyCard == null) {
			if (other.companyCard != null)
				return false;
		} else if (!companyCard.equals(other.companyCard))
			return false;
		if (total != other.total)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReportCompanyCardDetail [companyCard=" + companyCard + ", total=" + total + "]";
	}
		
}
