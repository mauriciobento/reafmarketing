package com.reafmarketing.card.management;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Singleton;

import com.reafmarketing.common.CompanyCard;
import com.reafmarketing.common.ReportCompanyCard;
import com.reafmarketing.common.ReportCompanyCardDetail;

@Singleton
public class CardManagement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1946359141627247482L;
	
	private List<CompanyCard> listCompany = new ArrayList<CompanyCard>();
	
	/**
	 * 
	 * @param companyCard
	 */
	public void addCompany(CompanyCard companyCard){
		listCompany.add(companyCard);
	}

	/**
	 * 
	 * @return
	 */
	public ReportCompanyCard reportCompanyCard(){
		ReportCompanyCard reportCompanyCard = new ReportCompanyCard();
		Map<String, ReportCompanyCardDetail> report = new HashMap<String, ReportCompanyCardDetail>();
		for (CompanyCard companyCard : listCompany) {
			if(report.containsKey(companyCard.getName())){
				ReportCompanyCardDetail reportDetail = report.get(companyCard.getName());
				reportDetail.setTotal(reportDetail.getTotal() + 1);
			}else{
				ReportCompanyCardDetail newReportDetail = new ReportCompanyCardDetail();
				newReportDetail.setCompanyCard(companyCard);
				newReportDetail.setTotal(1);
				report.put(companyCard.getName(), newReportDetail);
			}
		}		
		reportCompanyCard.setReport(new ArrayList<ReportCompanyCardDetail>(report.values()));
		return reportCompanyCard;
	}
	
	/**
	 * 
	 */
	public void cleanAll(){
		listCompany.clear();
	}
}
