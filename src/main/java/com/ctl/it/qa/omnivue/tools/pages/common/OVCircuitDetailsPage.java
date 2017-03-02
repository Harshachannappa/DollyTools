package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVCircuitDetailsPage extends OmniVuePage {

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(id="ALIAS1")
	public WebElementFacade tbx_Alias1;
	@FindBy(id="ALIAS2")
	public WebElementFacade tbx_Alias2;
	@FindBy(xpath="//label[text()='Usage Type']/../../..//span[2]//span//select")
	public WebElementFacade ddl_usagetype;
	@FindBy(id="DESCRIPTION" )
	public WebElementFacade tbx_notes;
	@FindBy(id="CIRCUIT2PROVISIONSTATUS")
	public WebElementFacade ddl_provisonstatus;
	@FindBy(id="mco")
    public WebElementFacade ddl_mco;
	@FindBy(id="BW")
    public WebElementFacade tbx_availablebw;	
	@FindBy(id="BANDWIDTH")
    public WebElementFacade tbx_provisonedbw;	
	@FindBy(id="SERVICE2SUBSCRIBER")
    public WebElementFacade tbx_subscribername;	
	@FindBy(id="CIRCUITSERVICETYPE")
    public WebElementFacade ddl_circuitservicetype;	
	
	@FindBy(id="TSP")
    public WebElementFacade tbx_tSP;	
	
	@FindBy(id="TRANSPORTTYPE")
    public WebElementFacade ddl_TransportType;	
	
	@FindBy(id="IS_DIVERSE")
    public WebElementFacade ddl_isdiverse;	
	@FindBy(id="EXCEPTION_HANDLING_INFO")
	public WebElementFacade tbx_exceptionhandlinginfo;
	
	
	
	
	@FindBy(id="STARTLAGNUMBER")
	public WebElementFacade tbx_startLagNum;
	@FindBy(id="ENDLAGNUMBER")
	public WebElementFacade tbx_endLagNum;
	@FindBy(xpath="//label[text()='Protection Type']/../../..//input")
	public WebElementFacade tbx_protectionType;
	@FindBy(xpath="//label[text()='LAG Number']/../../..//input")
	public WebElementFacade tbx_lagNumber;
	
	
	@FindBy(id="Transport Path")
	public WebElementFacade ddl_circuittype;
	
	
	
	
	
	
	//..........verification........
	@FindBy(xpath="//label[text()='Alias1']/../../..//span[2]//label")
	public WebElementFacade label_Alias1;
	@FindBy(xpath="//label[text()='Alias2']/../../..//span[2]//label")
	public WebElementFacade label_Alias2;
	
	@FindBy(xpath="//label[text()='Provision Status']/../../..//span[2]//label")
	public WebElementFacade label_provisonstatus;
	@FindBy(xpath="//label[text()='MCO']/../../..//span[2]//label")
	public WebElementFacade label_mco;
	@FindBy(xpath="//label[text()='Provision Status']/../../..//span[2]//label")
	public WebElementFacade label_startLagNum;
	@FindBy(xpath="//label[text()='Provision Status']/../../..//span[2]//label")
	public WebElementFacade label_endLagNum;
	@FindBy(xpath="//label[text()='Note']/../../..//span[2]//label")
	public WebElementFacade label_notes;
	@FindBy(xpath="//label[text()='Subscriber Name']/../../..//span[2]//label")
	public WebElementFacade label_subscribername;
	@FindBy(xpath="//label[text()='Circuit Service Type']/../../..//span[2]//label")
	public WebElementFacade label_circuitservicetype;
	@FindBy(xpath="//label[text()='Exception Handling Info']/../../..//span[2]//label")
	public WebElementFacade label_exceptionhandlinginfo;
	
	@FindBy(xpath="//label[text()='Protection Type']/../../..//span[2]//label")
	public WebElementFacade label_protectionType;
	
	@FindBy(xpath="//label[text()='LAG Number']/../../..//span[2]//label")
	public WebElementFacade label_lagNumber;
	
	
//TC39239
	@FindBy(id="--Select--")
	public WebElementFacade ddl_circuitTypeEthernet;
	@FindBy(xpath="//img[@alt='viewTask']")
	public WebElementFacade icon_circuit;
	@FindBy(xpath="//label[text()='Circuit Name %']/..//input")
	public WebElementFacade tbx_circuitname;
	@FindBy(xpath="//span[text()='Circuit Name']/../../../..//td[1]//a")
	public WebElementFacade link_circuitname;
	
	@FindBy(id="NAME")
	public WebElementFacade tbx_name; 
	
	
	
	
	

}
