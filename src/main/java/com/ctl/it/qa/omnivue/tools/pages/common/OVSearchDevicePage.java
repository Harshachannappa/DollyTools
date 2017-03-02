package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;
import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


public class OVSearchDevicePage extends OmniVuePage {
	UserSteps enduser;
	OVCreateDevicePage devcreatepage;
	OVActivationPage actvtnpage;
	
	@FindBy(xpath="//a[text()='Services']")
	public WebElementFacade tab_services;
	
	@FindBy(xpath=".//a[text()='CTag Pool']")
	public WebElementFacade tab_ctag;

	@FindBy(xpath=".//a[text()='Orders']")
	public WebElementFacade tab_orders;

	@FindBy(xpath=".//a[text()='Contacts']")
	public WebElementFacade tab_contact;
	
	@FindBy(xpath=".//a[text()='BAM Report']")
	public WebElementFacade tab_bamreport;
	
	@FindBy(xpath = "//a[text()='Activations']")
	public WebElementFacade tab_Activations;
	
	//Newly Added By MOHIT
	@FindBy(xpath="//a[text()='Subscribers']")
	public WebElementFacade tab_Subscriber;
	
	@FindBy(xpath="//a[text()='Circuits']")
	public WebElementFacade tab_Circuits;
	
	@FindBy(xpath="//a[text()='Tasks']")
	public WebElementFacade tab_Tasks;
	
	@FindBy(xpath="//a[text()='Locations']")
	public WebElementFacade tab_Locations;
	
	@FindBy(xpath="//a[text()='Devices']")
	public WebElementFacade tab_Devices;
	
	//olt
	//ont
	//mst
	//mdu
	//splitter
	
	//New changes--9/23
	
	
		
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']")
	public By lbl_attributes;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[4]/table/tbody[1]/tr/td[2]")
	public WebElementFacade tbx_deviceName;
	
	//New updates--9/23
	
	@FindBy(xpath="//thead[tr[th[text()='Subscriber Type']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SubscriberType;
	
	@FindBy(xpath="//thead[tr[th[text()='Subscriber Name']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_SubscriberName;
	
	@FindBy(xpath=".//*[@id='left-content-tab']/div/ul/li[2]/a/tab-heading")
	public WebElementFacade tab_NetworkDetail;
	
	
	@FindBy(xpath="//input[@id='port:LSVGNVXU03W-010017.06A184320124102/GE1/LSVGNVXU03W/LSVQNVOHRLD10']")
	public WebElementFacade btn_plusIconClick;
	
	
	@FindBy(xpath="//input[@value='Swap Card']")
	public WebElementFacade btn_swapCard;
	
	@FindBy(xpath="(//select[@id='deviceRole'])[1]")
	public WebElementFacade ddl_destnCard;
	
	//input[@value='Swap']
	@FindBy(xpath="//input[@value='Swap']")
	public WebElementFacade btn_swap;
	
	@FindBy(xpath="//input[@value='Edit Device Details']")
	public WebElementFacade btn_EditDeviceDetailbtn;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	public WebElementFacade btn_saveDeviceDetail;
	
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[2]")
	public WebElementFacade lbl_SerialName;
	
	@FindBy(xpath="//thead[tr[th[text()='Serial Number']]]/following-sibling::tbody[1]/tr/td[3]")
	public WebElementFacade lbl_VendorPartName;
	
	@FindBy(xpath="(//div[@class='container']/div[4]//tbody/tr[1]/td[2])[3]")
	public WebElementFacade lbl_DeviceName;
	
	@FindBy(xpath="//div[@class='device-detail-group'][7]/div[2]/span/label[1]")
	public WebElementFacade lbl_ServiceDeviceName;
	
	
	
	
	
	@FindBy(xpath="//span[span[label[text()='Start Device Name']]]/following-sibling::span/div/label/a")
	public WebElementFacade lbl_strtDev_portSectn;
	
	@FindBy(xpath="//span[span[label[text()='End Device Name']]]/following-sibling::span/div/label/a")
	public WebElementFacade lbl_endDev_portSectn;
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElementFacade btn_NDSaveButton;
	
	@FindBy(xpath="//a[text()='Task Details']")
	public WebElementFacade tag_taskDetails;
	
	@FindBy(xpath="//a[text()='Associated Circuits']")
	public WebElementFacade tag_circuitDetails;
	
	@FindBy(xpath="//a[text()='Associated Locations']")
	public WebElementFacade tag_LocationDetails;
	
	@FindBy(xpath="//a[text()='Device Details']")
	public WebElementFacade tag_deviceDetails;
	//end of new updates
	
	
	@FindBy(xpath="//label[text()='CSOF Order Number:']/following-sibling::label[1]")
	public WebElementFacade lbl_csofOrderNumber; 
	
	@FindBy(xpath="//tab-heading[contains(text(),'OrderNotes')]")
	public WebElementFacade lnk_orderNotes;
	
	@FindBy(xpath="//textarea[@ng-model='newOrderNote']")
	public WebElementFacade tbx_addNotes;
	
	@FindBy(xpath="//button[text()='Save Note']")
	public WebElementFacade btn_saveNotes;
	
	@FindBy(xpath="//textarea[@ng-model='orderNoteHistory']")
	public WebElementFacade tbx_orderNoteHistory;
	 
	
	public static String allsearchXapath="header-label"; // Have to find alternate to findelements
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		
		return tab_services;
	}
	
	public void click_servicetab(String tab) throws Exception {
		//tab_ctag.click();
		Thread.sleep(5000);
		System.out.println("Executed the line"+tab);
		
		if(tab.equals("Services")){
			tab_services.click();
			Thread.sleep(35000);
		}
		else if(tab.equals("CTag")){
			tab_ctag.click();
			
		}
		else if(tab.equals("Orders")){
			tab_orders.click();
			
		}
		else if(tab.equals("Contacts")){
			 tab_contact.click();
			
		}
		else if(tab.equals("BAM Report")){
			tab_bamreport.click();
			
		}
		else if(tab.equals("Activations")){
			tab_Activations.click();
			
		}
		//newly added by MOHIT
		else if(tab.equals("Devices")){
			tab_Devices.click();
			
		}
		else if(tab.equals("Tasks")){
			tab_Tasks.click();
			
		}
		else if(tab.equals("Locations")){
			tab_Locations.click();
			
		}
		else if(tab.equals("Circuits")){
			tab_Circuits.click();
			
		}
		else if(tab.equals("Subscribers")){
			tab_Subscriber.click();
			
		}
		Thread.sleep(35000);
						
	}
	
	public void attribute_field() throws Exception {
		Thread.sleep(3000);
		//String txtfields=enduser.getDriver().findElements(By.xpath(".//*[@id='left-content-tab']/div/div/div[1]/div/div/div[3]/div/div[4]/div/div[2]/table/thead/tr/th[@class='header-label']"));
		//System.out.println(lbl_attributes.getText());
		
	}
	
	//New updates-9/23
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
//			Assert.assertEquals("Subscriber Type is not same", sSubscriberType, actualSubscriberTypeFieldvalue);
			System.out.println("Subscriber Type is same");
			
			
			Boolean flag1 = sSubscriberName.equalsIgnoreCase(actualSubscriberNameFieldvalue);
			Assert.assertTrue("Subscriber Name is not same", flag1);
//			Assert.assertEquals("Subscriber Name is not same", sSubscriberName, actualSubscriberNameFieldvalue);
			System.out.println("Subscriber Name is same");
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void tabNetworkDetail(){
		tab_NetworkDetail.click();
	}
	
	
	public void clickedPlusIcon() throws InterruptedException{
		Thread.sleep(5000);
		btn_plusIconClick.click();
	}
	
	public void verifyAndClickSwapCardBtn() throws InterruptedException{
		Thread.sleep(5000);
		try{
			
			Boolean flag = btn_swapCard.isDisplayed();
			Assert.assertTrue(" Swap Card Button not visible", flag);
			
			btn_swapCard.click();
			Thread.sleep(5000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	public void verifyAndSelectDestn(String destnCardValue) throws InterruptedException{
		Thread.sleep(5000);
		try{
			
			ddl_destnCard.selectByVisibleText(destnCardValue);
			
			Thread.sleep(5000);
			String selectedSearchType = ddl_destnCard.getSelectedVisibleTextValue();
			System.out.println("selectedSearchType = "+selectedSearchType);
			Boolean flag = selectedSearchType.contains(destnCardValue);
			System.out.println("flag = "+flag);
			Assert.assertTrue("Destination card value not present in the dropdown", flag);
			
			btn_swap.click();
			Thread.sleep(5000);

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void click_EditDeviceDetailbtn(String button) throws InterruptedException {
		if(button.equals("Edit")){
		btn_EditDeviceDetailbtn.click();
		}
		else if(button.equals("Save")){
			btn_NDSaveButton.click();
			}
		Thread.sleep(5000);
	}
	
	public void saveNetworkingDetails() throws InterruptedException{
		btn_saveDeviceDetail.click();//Rework
		Thread.sleep(5000);
	}
	
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
	
	public void validate_DeviceNameValue() throws InterruptedException {
		Thread.sleep(15000);
		String deviceName = lbl_DeviceName.getText();
		System.out.println(deviceName);
		String serviceDeviceName = lbl_ServiceDeviceName.getText();
		System.out.println(serviceDeviceName);
		Assert.assertEquals("device name is not same", serviceDeviceName, deviceName);
		System.out.println("device name is same");
}
	
	
	public void validate_DeviceName_PortSection() throws InterruptedException {
		try{
		Thread.sleep(15000);
		String deviceName = lbl_DeviceName.getText().trim();
		String startdeviceName = lbl_strtDev_portSectn.getText().trim();
		String enddeviceName = lbl_endDev_portSectn.getText().trim();
		System.out.println("deviceName ="+deviceName);
		System.out.println("startdeviceName ="+startdeviceName);
		System.out.println("enddeviceName ="+enddeviceName);
		
		if(deviceName.equalsIgnoreCase(startdeviceName)){
			
			System.out.println("Device Name Present");
			
		}
		else if(deviceName.equalsIgnoreCase(enddeviceName)){
			
			System.out.println("Device Name Present");
			
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
}
	
	public void verfiy_relatedTabPage(String Tab) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(getDriver(), 180);
		if(Tab.equals("Tasks")){
			wait.until(ExpectedConditions.visibilityOf(tag_taskDetails));
			Assert.assertTrue(tag_taskDetails.isDisplayed());
		}
		
		else if(Tab.equals("Locations")){
			wait.until(ExpectedConditions.visibilityOf(tag_LocationDetails));
			System.out.println("location wait done");
			Assert.assertTrue(tag_LocationDetails.isDisplayed());
		}
		
		else if(Tab.equals("Circuits")){
			wait.until(ExpectedConditions.visibilityOf(tag_circuitDetails));
			System.out.println("Circuit wait done");
			Assert.assertTrue(tag_circuitDetails.isDisplayed());
		}
		
		else if(Tab.equals("Devices")){
			wait.until(ExpectedConditions.visibilityOf(tag_deviceDetails));
			System.out.println("Device wait done");
			Assert.assertTrue(tag_deviceDetails.isDisplayed());
		}
		
		Thread.sleep(3000);		
		
	}
	@FindBy(xpath="(//span[span[label[text()='Device Name']]])[3]/following-sibling::span/div/label/a")
	public WebElementFacade lbl_ServiceAreaDeviceName; 
	@FindBy(xpath="(//span[span[label[text()='Service Area Name']]])[3]/following-sibling::span/div/label")
	public WebElementFacade lbl_ServiceAreaName; 
	
		@FindBy(xpath="(//span[span[label[text()='Subscriber Full Name']]])[3]/following-sibling::span/div/label")
		public WebElementFacade lbl_SubscriberFullName; 
		@FindBy(xpath="(//span[span[label[text()='Subscriber ID']]])[3]/following-sibling::span/div/label")
		public WebElementFacade lbl_SubscriberID;
		
		@FindBy(xpath="(//span[span[label[text()='Subscriber Type']]])[3]/following-sibling::span/div/label")
		public WebElementFacade lbl_CreateSubscriberType;
		
		@FindBy(xpath="(//span[span[label[text()='Subscriber Sub-Type']]])[3]/following-sibling::span/div/label")
		public WebElementFacade lbl_CreateSubscriberSubType; 

	
	
	public void validateServiceAreaDetail(String template){
		try {
			
			Thread.sleep(5000);
			String sdeviceName = lbl_ServiceAreaDeviceName.getText().trim();
			String sServiceAreaName = lbl_ServiceAreaName.getText().trim();
			
			System.out.println("sdeviceName ="+sdeviceName);
			System.out.println("sServiceAreaName ="+sServiceAreaName);
			UserSteps enduser = new UserSteps();
			
			IntDataContainer datacontainer = enduser.get_data_for_page(devcreatepage).getContainer(template).getContainer("ServiceDeviceNameData");
			String fieldValue = datacontainer.getFieldValue("tbx_Servicsdevicelookup");
			
			
			datacontainer = enduser.get_data_for_page(devcreatepage).getContainer(template).getContainer("ServiceAreaName");
			String fieldValue1 = datacontainer.getFieldValue("tbx_CreateServiceAreaName");
			
			System.out.println("fieldValue ="+fieldValue);
			System.out.println("fieldValue1 ="+fieldValue1);
			
			String FielsString[] = fieldValue.split(":");
			String actualServiceDeviceName = FielsString[1];
			System.out.println("actualServiceDeviceName= "+actualServiceDeviceName);
			
			
			String FielsString1[] = fieldValue1.split(":");
			String actualServiceAreaName = FielsString1[1];
			System.out.println("actualServiceAreaName= "+actualServiceAreaName);
			
			Boolean flag = sdeviceName.equalsIgnoreCase(actualServiceDeviceName);
			Assert.assertTrue("Service Device Name is not same", flag);
//			Assert.assertEquals("Subscriber Type is not same", sSubscriberType, actualSubscriberTypeFieldvalue);
			System.out.println("Service Device Name is same");
			
			
			Boolean flag1 = sServiceAreaName.equalsIgnoreCase(actualServiceAreaName);
			Assert.assertTrue("Service Area name is not same", flag1);
//			Assert.assertEquals("Subscriber Name is not same", sSubscriberName, actualSubscriberNameFieldvalue);
			System.out.println("Service Area name is same");
			
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} 

	public void validateSubscriberDetail(String template){
		try {
			String sSubscriberFullName = lbl_SubscriberFullName.getText().trim();
			String sSubscriberID = lbl_SubscriberID.getText().trim();
			String sSubscriberType = lbl_CreateSubscriberType.getText().trim();
			String sSubscriberSubType = lbl_CreateSubscriberSubType.getText().trim();
			System.out.println("sSubscriberFullName ="+sSubscriberFullName);
			System.out.println("sSubscriberID ="+sSubscriberID);
			System.out.println("sSubscriberType ="+sSubscriberType);
			System.out.println("sSubscriberSubType ="+sSubscriberSubType);
			
			
			UserSteps enduser = new UserSteps();
			IntDataContainer datacontainer = enduser.get_data_for_page(devcreatepage).getContainer(template).getContainer("Devicedata");
			String fieldValueSubsName = datacontainer.getFieldValue("tbx_subcsname");
			String fieldValueSubsID = datacontainer.getFieldValue("tbx_subscid");
			String fieldValueSubsSubType = datacontainer.getFieldValue("ddl_subcsubtype");
			String fieldValueSubsType = datacontainer.getFieldValue("ddl_subctype");
			System.out.println("fieldValueSubsName ="+fieldValueSubsName);
			System.out.println("fieldValueSubsID ="+fieldValueSubsID);
			System.out.println("fieldValueSubsSubType ="+fieldValueSubsSubType);
			System.out.println("fieldValueSubsType ="+fieldValueSubsType);
			
			String FielsString[] = fieldValueSubsName.split(":");
			String actualSubsNamevalue = FielsString[1];
			System.out.println("actualSubsNamevalue= "+actualSubsNamevalue);
			
			String FielsString1[] = fieldValueSubsID.split(":");
			String actualSubscriberIDFieldvalue = FielsString1[1];
			System.out.println("actualSubscriberIDFieldvalue= "+actualSubscriberIDFieldvalue);
			
			String FielsString2[] = fieldValueSubsSubType.split(":");
			String actualSubscriberSubsTypeFieldvalue = FielsString2[1];
			System.out.println("actualSubscriberSubsTypeFieldvalue= "+actualSubscriberSubsTypeFieldvalue);
			
			String FielsString3[] = fieldValueSubsType.split(":");
			String actualSubscriberTypeFieldvalue = FielsString3[1];
			System.out.println("actualSubscriberTypeFieldvalue= "+actualSubscriberTypeFieldvalue);
			
			Boolean flag = sSubscriberFullName.equalsIgnoreCase(actualSubsNamevalue);
			Assert.assertTrue("Subscriber Full Name is not same", flag);
			System.out.println("Subscriber Full Name is same");
			
			Boolean flag1 = sSubscriberID.equalsIgnoreCase(actualSubscriberIDFieldvalue);
			Assert.assertTrue("Subscriber ID is not same", flag1);
			System.out.println("Subscriber ID is same");
			
			Boolean flag2 = sSubscriberSubType.equalsIgnoreCase(actualSubscriberSubsTypeFieldvalue);
			Assert.assertTrue("Subscriber Sub Type is not same", flag2);
			System.out.println("Subscriber Sub Type is same");
			
			Boolean flag3 = sSubscriberType.equalsIgnoreCase(actualSubscriberTypeFieldvalue);
			Assert.assertTrue("Subscriber Type is not same", flag3);
			System.out.println("Subscriber Type is same");
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} 
}
