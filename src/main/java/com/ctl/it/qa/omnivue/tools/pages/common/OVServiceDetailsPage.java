package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class OVServiceDetailsPage extends OmniVuePage {

	OVCreateDevicePage devcreatepage;
	OVActivationPage actvtnpage;
	
	
	
	@FindBy(id="NAME")
	public WebElementFacade tbx_editDeviceName;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[14]/div[1]/div/span/input[@value='Save']")
	public WebElementFacade btn_save;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_device;
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[1]")
	public WebElementFacade tab_close;
	// close tab of service page []
	
	@FindBy(xpath=".//*[@id='mainTab']/div/ul/li[3]/a/tab-heading/a[@ng-click='removeTab(tab.id,$index)']/img[2]")
	public WebElementFacade tab1_close;
	//close tab of service page [*]
	
	@FindBy(xpath=".//*[@id='dropdownMenu1']/img")
	public WebElementFacade img_settings;
	
	@FindBy(xpath=".//div[2]/div/label[3]/img[@ng-click='deletePoolRange(ind)']")
	public WebElementFacade btn_Ctagdelete;
		
	@FindBy(xpath="//a[text()='Logout']")
	public WebElementFacade lnk_logoutInSettings;
	
	//Order Validation
	
	@FindBy(xpath=".//label[text()='CSOF Order Number:']/following-sibling::label[1]")
	public WebElementFacade lbl_csof_id;
	
	@FindBy(xpath=".//label[text()='Subscriber:']/following-sibling::label[1]")
	public WebElementFacade lbl_subscriber;
	
	@FindBy(xpath=".//label[text()='DTN:']/following-sibling::label[1]")
	public WebElementFacade lbl_dtn;
	
	@FindBy(xpath=".//label[text()='EnsembleOrderNumber']/following-sibling::label[1]")
	public WebElementFacade lbl_EnsembleOrderNumber;
	
	// End of Order Validation
	
	//Contact validation
	
	@FindBy(xpath=".//*[@value='Add Contact']")
	public WebElementFacade btn_addcontact;
	
	
	//created by Dolly
	@FindBy(xpath="(//div[label[contains(text(),'QOS Template Name')]]/following-sibling::div/label[1])[1]")
	public WebElementFacade lbl_templateName;
	
	//created by Dolly
	@FindBy(xpath="//thead[tr[th[text()='Subscriber Type']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SubscriberType;
	
	//created by Dolly
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SerialName;
	
	
	//created by Dolly
	@FindBy(xpath="//thead[tr[th[text()='Subscriber Name']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_SubscriberName;
	
	//created by Dolly
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_VendorPartName;
	
		
	@FindBy(xpath="//*[contains(text(),'Create Contact')]")
	public WebElementFacade createcontacttab;
	
	//End of Contact validation
		
	//Bam Table validation ----- 21/7/2016
	
	@FindBy(xpath="//*[@jqx-create='createBamlog']")
	public WebElementFacade lbl_bamtable;
	
	

	
	
	//End of BAM table
	
	
	
	@FindBy(xpath=".//*[text()='No Associated Services to display']")
	public WebElementFacade lbl_service_msg;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return null;
	}
	
		
	public void click_savebtn() throws Exception {
		btn_save.click();
		Thread.sleep(5000);
	}
	
	
	public void click_devicetab() throws Exception {
		//close_tab.click();
		//Thread.sleep(5000);
		tab_device.click();
	}
	
	
	public void click_closetab(){
	
		// trying to click on close button .As it have 2image of close , we kept it in nested try.
		try {
			tab_close.click();
			Thread.sleep(2000);
		}
			catch (Exception  e) {
				e.printStackTrace();
		try { 
			tab1_close.click();
			//Thread.sleep(2000);
		}
		catch (Exception e1) {	
		// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
			}
	
	}
	public void Revertname(){
		tbx_editDeviceName.sendKeys("77/L1XX/785391//CTQF");	
	}
	
	public void click_logoutinsettings() throws Exception {
		img_settings.click();
		Thread.sleep(2000);
		lnk_logoutInSettings.click();
		Thread.sleep(15000);
	}

	public void click_Ctagdelete() {
		btn_Ctagdelete.click();
	}
	
	//Validating the Add contact present in location search
		public void validateaddcontactbutton(){
			try {
			if(btn_addcontact.isVisible()){
				btn_addcontact.click();
				Thread.sleep(3000);
				if(createcontacttab.isVisible()){
					System.out.println("Valiadted Add contact button successfully");
					Thread.sleep(3000);
				}
				
			}				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		
		
		public boolean Validation_Usabilites(String serviceType,String serviceCapabilityType1,String serviceCapabilityType2) throws InterruptedException {
			int validation=0;
			List<WebElementFacade> serviceList = devcreatepage.lbl_allServiceXapath;
			ArrayList<String> services=new ArrayList<String>();
			for(int j=0;j<serviceList.size();j++){
				services.add(j, serviceList.get(j).getText());
						
			}
			for(int i=0;i<services.size();i++){
				
				 if(services.get(i).equals(serviceType))
				 {				
					String actualServiceCapabilityTypeXpath="//div[contains(@id,'row"+i+"serviceGrid_')]/div[4]/div";
					 
					 String actualServiceCapabilityType=find(By.xpath(actualServiceCapabilityTypeXpath)).getText();
					 System.out.println("check wat is this next"+actualServiceCapabilityType);
					 if(actualServiceCapabilityType.equals(serviceCapabilityType1)||actualServiceCapabilityType.equals(serviceCapabilityType2))
					 {
						 System.out.println("Successfully validated");						 
						 System.out.println(services.get(i));
						 System.out.println(actualServiceCapabilityType);
						 validation=1;
					}
					 
				}
			}
			if(validation==1){
				return true;
				}
				else {				
				return false;
				}
		}
		
		public void validate_servicetab(){
			if(lbl_service_msg.isVisible())
			{
				System.out.println("No service is present");
			}
			else throw new Error("Service is prsent");
			
		}
		
		public void bam_log_validation(){	//I am validating Bam table is present or not
			if(lbl_bamtable.isDisplayed()){
				System.out.println("BAM Table is present");
			}
			else throw new Error("BAM Table is not Present");
		}
		
		
		
		/**
		 * @author Dolly
		 * @param template
		 * description Method used to validate List view should be displayed when search is performed
		 */
		public void validateViewList(String template){
			try {
				String sTemplateName = lbl_templateName.getText();
				System.out.println("sTemplateName ="+sTemplateName);
				UserSteps enduser = new UserSteps();
				
				IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template);
				String fieldValue = datacontainer.getFieldValue("tbx_templateName");
				String FielsString[] = fieldValue.split(":");
				String actualFieldvalue = FielsString[1];
				System.out.println(actualFieldvalue);
			if(sTemplateName.contains(actualFieldvalue)){
				Thread.sleep(3000);
				System.out.println("List view displayed when search is performed.");

			}
			else
			{
				System.out.println("List view not displayed when search is performed.");
			}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		
		/**
		 * @author Dolly
		 * @description Method used to validate the information in Device Detail Page after Edit done 
		 */
		public void validateDeviceDetail(String template){
			try {
				String sSubscriberType = lbl_SubscriberType.getText();
				String sSubscriberName = lbl_SubscriberName.getText();
				
				System.out.println("sSubscriberType ="+sSubscriberType);
				System.out.println("sSubscriberName ="+sSubscriberName);
				UserSteps enduser = new UserSteps();
				
				IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template).getContainer("SubscriberName");
				String fieldValue = datacontainer.getFieldValue("ddl_SubscriberType");
				String fieldValue1 = datacontainer.getFieldValue("tbx_Subscribername");
				
				System.out.println("fieldValue ="+fieldValue);
				System.out.println("fieldValue1 ="+fieldValue1);
				
				String FielsString[] = fieldValue.split(":");
				String actualSubscriberTypeFieldvalue = FielsString[1];
				System.out.println("actualSubscriberTypeFieldvalue= "+actualSubscriberTypeFieldvalue);
				
				
				String FielsString1[] = fieldValue1.split(":");
				String actualSubscriberNameFieldvalue = FielsString1[1];
				System.out.println("actualSubscriberNameFieldvalue= "+actualSubscriberNameFieldvalue);
				
				Boolean flag = sSubscriberType.equalsIgnoreCase(actualSubscriberTypeFieldvalue);
				Assert.assertTrue("Subscriber Type is not same", flag);
//				Assert.assertEquals("Subscriber Type is not same", sSubscriberType, actualSubscriberTypeFieldvalue);
				System.out.println("Subscriber Type is same");
				
				
				Boolean flag1 = sSubscriberName.equalsIgnoreCase(actualSubscriberNameFieldvalue);
				Assert.assertTrue("Subscriber Name is not same", flag1);
//				Assert.assertEquals("Subscriber Name is not same", sSubscriberName, actualSubscriberNameFieldvalue);
				System.out.println("Subscriber Name is same");
				
			}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		
		
		
		/**
		 * @author Dolly
		 * @param template
		 * description Method used to validate the Networking Details after editing is done
		 */
		public void validateNetworkDetail(String template){
			try {
				String sSerialName = lbl_SerialName.getText();
				String actualSerialName = sSerialName.trim();
				System.out.println("actualSerialName= "+actualSerialName);
				
				String sVendorPartName = lbl_VendorPartName.getText();
				String actualVendorPartName = sVendorPartName.trim();
				System.out.println("actualVendorPartName= "+actualVendorPartName);
				
				System.out.println("sSerialName ="+sSerialName);
				System.out.println("sVendorPartName ="+sVendorPartName);
				UserSteps enduser = new UserSteps();
				
				IntDataContainer datacontainer = enduser.get_data_for_page(actvtnpage).getContainer(template);
				String fieldValue = datacontainer.getFieldValue("tbx_serialNumber");
				String fieldValue1 = datacontainer.getFieldValue("tbx_vendorPartNumber");
				
				System.out.println("fieldValue ="+fieldValue);
				System.out.println("fieldValue1 ="+fieldValue1);
				
				String FielsString[] = fieldValue.split(":");
				String expectSerialNameFieldvalue = FielsString[1];
				System.out.println("actualSerialNameFieldvalue= "+expectSerialNameFieldvalue);
				
				
				String FielsString1[] = fieldValue1.split(":");
				String expectVendorPartNameFieldvalue = FielsString1[1];
				System.out.println("actualVendorPartNameFieldvalue= "+expectVendorPartNameFieldvalue);
				
				Assert.assertEquals("Serial Name is not same", expectSerialNameFieldvalue, actualSerialName);
				System.out.println("Serial Name is same");
				
				Assert.assertEquals("Vendor Part Name is not same", expectVendorPartNameFieldvalue, actualVendorPartName);
				System.out.println("Vendor Part Name is same");
				
			}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		
		

}
