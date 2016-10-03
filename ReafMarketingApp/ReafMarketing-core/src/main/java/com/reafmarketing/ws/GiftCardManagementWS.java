package com.reafmarketing.ws;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.reafmarketing.card.management.CardManagement;
import com.reafmarketing.common.CompanyCard;
import com.reafmarketing.common.GiftCardException;
import com.reafmarketing.common.ReportCompanyCard;
import com.reafmarketing.ws.management.IGiftCardManagement;

@Stateless(mappedName= "GiftCardManagement")
@WebService(name = "GiftCardManagement", targetNamespace = GiftCardManagementWS.NAMESPACE)
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Remote(value = IGiftCardManagement.class)
public class GiftCardManagementWS implements IGiftCardManagement{
	
	static final String NAMESPACE = "http://www.reafmarketing.com/GiftCardManagement/";
	
	@EJB
	CardManagement cardManagement;

	@WebMethod
	@WebResult(name = "giftCardSelected", targetNamespace = GiftCardManagementWS.NAMESPACE, partName = "parameters")	
	public void giftCardSelected(
			@WebParam(name = "companyCard", targetNamespace = GiftCardManagementWS.NAMESPACE, partName = "parameters") CompanyCard parameters) 
					throws GiftCardException {
		cardManagement.addCompany(parameters);
	}
	
	@WebMethod
	@WebResult(name = "reportAccessCard", targetNamespace = GiftCardManagementWS.NAMESPACE, partName = "result")	
	public ReportCompanyCard reportAccessCard()	throws GiftCardException {
		return cardManagement.reportCompanyCard();
	}
	
}
