package com.ctl.it.qa.omnivue.tools.pages.common;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVLocationDetailsPage extends OmniVuePage {

	@FindBy(xpath = "//a[text()='Subscribers']")
	public WebElementFacade btn_subscriber;

	// TC55726
	@FindBy(xpath = "//input[@value='Edit']")
	public WebElementFacade btn_Edit;

	@FindBy(xpath = "(//input[@value='Add Subscriber Association'])[2]")
	public WebElementFacade btn_AddSubScriber;
	
	//TC39188
	@FindBy(id="lowstreet")
	public WebElementFacade tbx_Lowstreet;
	
	@FindBy(id="highstreet")
	public WebElementFacade tbx_Highstreet;
	
	@FindBy(xpath="(//input[@id='highstreet'])[2]")
	public WebElementFacade tbx_verHighstreet;
	
	@FindBy(id="indicator")
	public WebElementFacade ddl_Indicator;
	
	@FindBy(id="streetDirectionPrefix")
	public WebElementFacade ddl_streetdirectionprefix;
	
	@FindBy(id="street")
	public WebElementFacade tbx_street;
	
	@FindBy(id="streetType")
	public WebElementFacade ddl_streetType; 
	
	@FindBy(xpath="//input[@value='Add Individual Addresses']")
	public WebElementFacade btn_AddIndividualAddress; 
	
	@FindBy(id="addressNumber")
	public WebElementFacade tbx_addressField; 
	@FindBy(xpath="//*[@id='AddressRole']/option[2]")
	public WebElementFacade ddl_locationRole;

	@FindBy(xpath="(.//*[@id='NewConstructionIndicator'])[2]")
	public WebElementFacade ddl_NewConstructionInd; 
	
	@FindBy(xpath="(.//*[@value='Create'])[2]")
	public WebElementFacade btn_createForAddress; 
	@FindBy(id="sWCCLLI")
	public WebElementFacade tbx_SWCCLLI;
	
		@FindBy(xpath="(//Select[@id='state'])[2]")
		public WebElementFacade ddl_state; 
		
			@FindBy(id="city")
			public WebElementFacade ddl_city;
			@FindBy(id="zip")
			public WebElementFacade tbx_zip;
			@FindBy(id="NewConstructionIndicator")
			public WebElementFacade ddl_newConstruction; 

			 



	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return btn_subscriber;
	}
	
	public void Addsubbtnverify() {
		Assert.assertTrue(btn_AddSubScriber.isPresent());
		btn_AddSubScriber.click();
	}
	// -------------------------ANKIT NEW----------------------------

	public void verifyfield() {
		Assert.assertTrue(tbx_Lowstreet.isDisplayed());
	}
	
	public void modifieddata(String data)
	{
		
		String s3=data.substring(0, 2);
		System.out.println(s3);
		s3=s3+data.substring(12, 13);
		System.out.println(s3);
		tbx_Lowstreet.sendKeys(s3);
		
	} 
	
	public void click_verrifyAddIndividualAddresss() throws InterruptedException
	{
		Thread.sleep(5000);
		if(btn_AddIndividualAddress.isDisplayed())
		{
			btn_AddIndividualAddress.click();
			Thread.sleep(5000);
		}
	}

}


