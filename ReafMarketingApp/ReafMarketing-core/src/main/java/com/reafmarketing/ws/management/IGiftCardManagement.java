package com.reafmarketing.ws.management;

import com.reafmarketing.common.CompanyCard;
import com.reafmarketing.common.GiftCardException;
import com.reafmarketing.common.ReportCompanyCard;

public interface IGiftCardManagement {

	void giftCardSelected(CompanyCard parameters) throws GiftCardException;
	
	ReportCompanyCard reportAccessCard() throws GiftCardException;
	
}
