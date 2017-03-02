package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVServiceResultPage extends OmniVuePage {

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
 @FindBy(id="NAME")
 public WebElementFacade tbx_Name;
 @FindBy(id="ALIAS1")
 public WebElementFacade tbx_Alias1;
 @FindBy(id="ALIAS2")
 public WebElementFacade tbx_Alias2;
 @FindBy(id="DESCRIPTION")
 public WebElementFacade tbx_notes;
 @FindBy(id="SERVICE2SUBSCRIBER")
 public WebElementFacade tbx_subscribername;
 @FindBy(id="FID_NAME")
 public WebElementFacade tbx_fullname;
 @FindBy(id="HOST_ACCEPTANCE_STATUS")
 public WebElementFacade ddl_HostAcceptanceStatus;
 @FindBy(id="CUSTOMER_ACCEPTANCE_STATUS")
 public WebElementFacade ddl_CustomerAcceptanceStatus;
 @FindBy(id="ACCEPTS_PREMIUM_SERVICES")
public WebElementFacade ddl_AcceptsPremiumServices;
 @FindBy(id="ACCEPTS_CVOIP")
 public WebElementFacade ddl_AcceptsCvoip;
 @FindBy(id="HOSTIPVERSION")
 public WebElementFacade ddl_SupportedIpVersion;
 @FindBy(id="NWPROTOCOLTYPE")
 public WebElementFacade ddl_NetworkProtocol;
 @FindBy(id="SERVICECAPABILITY")
 public WebElementFacade ddl_ServiceCapabilityType;


}
