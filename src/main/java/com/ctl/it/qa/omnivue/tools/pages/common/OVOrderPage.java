package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ctl.it.qa.omnivue.tools.steps.user.UserSteps;

import net.serenitybdd.core.pages.WebElementFacade;

public class OVOrderPage {

	OVCreateDevicePage devcreatepage;
	UserSteps enduser;
	OVLoginPage loginPage;
	
	public void createorderattributes(){
	
	try
	{	
		Thread.sleep(5000);
		ArrayList<String> orderAttributes = new ArrayList<String>();

		orderAttributes.add(0, "Order #*");
		orderAttributes.add(1, "Customer First Name*");
		orderAttributes.add(2, "Customer Last Name*");
		orderAttributes.add(3, "BAN");
		orderAttributes.add(4, "Customer type*");
		orderAttributes.add(5, "Customer Subtype*");
		orderAttributes.add(5, "Account Type*");	
		orderAttributes.add(5, "Service Address*");	
		orderAttributes.add(5, "Address Line 2");	
		orderAttributes.add(5, "Wire Center CLLI*");	
		orderAttributes.add(5, "Latitude*");	
		orderAttributes.add(5, "Longitude*");	
		orderAttributes.add(5, "Remarks");	
		orderAttributes.add(5, "DTN*");	
		orderAttributes.add(5, "Reason Code*");	
		orderAttributes.add(5, "Service Type*");	
		orderAttributes.add(5, "Down Speed*");	
		orderAttributes.add(5, "Up Speed*");	
		orderAttributes.add(5, "Action*");	
		orderAttributes.add(5, "Test Order*");	
		orderAttributes.add(5, "Feature Code Collection");	
		orderAttributes.add(5, "Feature Code Remark");	
		orderAttributes.add(5, "Appointment Start Date*");	
		orderAttributes.add(5, "Appointment Start Time*");	
		orderAttributes.add(5, "Appointment End Date*");	
		orderAttributes.add(5, "Appointment End Time*");	
		orderAttributes.add(5, "Requested Due Date*");	
		orderAttributes.add(5, "Remark");								
	
		//List<WebElementFacade> Ordercreatelist = devcreatepage.lbl_allXapath;
		
		List<WebElement> Ordercreatelist = loginPage.getDriver()
				.findElements(By.xpath(".//*[@class='control-label ng-binding']"));
		ArrayList<String> OrderatributesOfPage=new ArrayList<String>();
		System.out.println("Step one done");
		
		for(int j=0;j<Ordercreatelist.size();j++){
			
			OrderatributesOfPage.add(j, Ordercreatelist.get(j).getText());
			
			System.out.println("Step Two done");
			//System.out.println(atributesOfPage.get(j));
		}
		
		System.out.println(OrderatributesOfPage);
		
		if (OrderatributesOfPage.containsAll(orderAttributes)) {
			System.out.println("pass");
		} else throw new Error("fail");
			
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	}
}
