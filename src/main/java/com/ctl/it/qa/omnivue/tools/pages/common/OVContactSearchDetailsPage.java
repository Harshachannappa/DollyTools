package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.List;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVContactSearchDetailsPage extends OmniVuePage {
	public String verification_loaction=null;

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}
	@FindBy(id="firstName")
	public WebElementFacade tbx_firstname;
	@FindBy(id="EMAIL")
	public WebElementFacade tbx_Email;
	@FindBy(id="lastName")
	public WebElementFacade tbx_lastname;
	@FindBy(id="contactCategory")
	public WebElementFacade ddl_Category;
	@FindBy(xpath="(//select[@id='contactType'])[2]")
	public WebElementFacade ddl_ContactType;
	@FindBy(xpath="(//input[@class='cmdButton'])[1]")
	public WebElementFacade btn_save;
	@FindBy(xpath="(//input[@id='ContactRole'])[1]")
	public WebElementFacade cbx_Circuit;
   @FindBy(xpath="(//label[text()='Contact Type'])[3]/../../..//div/label")
   public WebElementFacade verf_contacttype;
   
   @FindBy(xpath="//label[text()='First Name']/../../..//div//label")
   public WebElementFacade verf_firstname;
   
   
   @FindBy(xpath="//label[text()='Last Name']/../../..//div//label")
   public WebElementFacade verf_lastname;
   
   @FindBy(xpath="//label[text()='Email']/../../..//div//label")
   public WebElementFacade verf_email;
   
   @FindBy(xpath="//label[text()='Category']/../../..//div//label")
   public WebElementFacade verf_category;
   
   @FindBy(xpath="(//input[@id='allDay'])[1]")
   public WebElementFacade cbx_Email;
   
   @FindBy(xpath="(//input[@id='ContactRole'])[1]")
   public WebElementFacade cbx_account; 
 @FindBy(xpath="(//div[@ng-repeat='option in field.options'])[6]//label//input")
   public WebElementFacade cbx_Email24; 
	
 @FindBy(xpath="//label[text()='Contact Type']/../../..//span[2]//span//select")
 public WebElementFacade ddl_ContactTypeForCreateContact; 
   
   public void validate(List<String> al)
   {
	  //
	   System.out.println(verf_firstname.getText().trim());
	   Assert.assertEquals(verf_firstname.getText().trim()	, al.get(0));
	   System.out.println(verf_lastname.getText().trim());
   // Assert.assertEquals(verf_firstname.getText().trim()	, al.get(0));
    System.out.println("1");
    Assert.assertEquals(verf_lastname.getText().trim()	, al.get(1));
    System.out.println("2");
    Assert.assertEquals(verf_category.getText().trim()	, al.get(2));
    System.out.println("3");
    Assert.assertEquals(verf_contacttype.getText().trim()	, al.get(3));
    System.out.println("4");
    Assert.assertEquals(verf_email.getText().trim()	, al.get(4));
    System.out.println("5");

    
    System.out.println("verification done");
    
   }
   
 //------------------------------------------------ANKIT NEW------------------------
   //TC55726
   @FindBy(xpath="(//tab-heading[@class='ng-binding ng-scope'])[4]")
   public WebElementFacade tab_auditlogs;
   
   public void selectallcheckbox() throws InterruptedException
   {
	   cbx_account.click(); 
	   cbx_Email24.click();   
   }
	 
  @FindBy(xpath="//label[text()='Name']/../../..//span[3]//input")
  public WebElementFacade tbx_circuitname;
  @FindBy(xpath="(//label[text()='Circuit Type']/..//select)[2]")
  public WebElementFacade ddl_circuittype;
  @FindBy(xpath="(//input[@value='LookUp'])[3]")
  public WebElementFacade btn_lookup;
  
  @FindBy(xpath="//span[text()='Circuit Name']/../../../..//tbody//td[1]//a")
  public WebElementFacade link_lookup;
  
  @FindBy(xpath="//label[text()='Object Type']/..//select")
  public WebElementFacade ddl_objecttype;
  
  @FindBy(xpath="//label[text()='Relation Type']/..//select")
  public WebElementFacade ddl_relationtype;
  
  @FindBy(xpath="(//img[@alt='viewTask'])[2]")
  public WebElementFacade link_img;
  @FindBy(xpath="//label[text()='Circuit Name %']/../..//input")
  public WebElementFacade tbx_circuitname_popup; 
  
  @FindBy(xpath="(//div[contains(text(),'Associated Address(es)')]/../..)[2]//div[2]//button")
  public WebElementFacade btn_AddMoreAddress;
  @FindBy(xpath="//button[text()='Edit']")
  public WebElementFacade btn_Edit;
  
  @FindBy(xpath="(//label[text()='Building CLLI %'])[3]/..//input")
  public WebElementFacade tbx_buidingClli;
  @FindBy(xpath="//button[text()='Search Locations']")
  public WebElementFacade btn_searchlocation;
  @FindBy(id="12912308")
  public WebElementFacade cbx_terminal;
  @FindBy(xpath="//button[text()='Associate Address(es)']")
  public WebElementFacade btn_Associateaddress;
  @FindBy(xpath="//tab-heading[contains(text(),'Service Area Search Results')]")
  public WebElementFacade tab_ServiceAreaSearch;
  @FindBy(xpath="//button[text()='Save']")
  public WebElementFacade btn_Saveservice;
  @FindBy(xpath="(//input[@id='12912308'])[1]/../../td[5]//span")
  public WebElementFacade verf_location;
  @FindBy(xpath="(//a[text()='A1290'])[2]")
  public WebElementFacade verification_locationName;
  
  public void selecting_data() throws InterruptedException
  {
	  Thread.sleep(6000);
	  System.out.println("slleepS");
	  btn_searchlocation.click();
	  cbx_terminal.click();
	verification_loaction=  verf_location.getText();
	  btn_Associateaddress.click();
	  Thread.sleep(3000);
	  btn_Saveservice.click();
	  
	  
	  
  }
  
  
  public void enter_circuit_Details() throws InterruptedException 
  {
	  //Thread.sleep(5000);
	 // System.out.println(getDriver().getWindowHandles().size());
	//  getDriver().switchTo().alert().
	// switchToChildWindow();
	  btn_lookup.click();
	  Thread.sleep(5000);
	  link_lookup.click();
	  ddl_relationtype.selectByVisibleText("S-VLAN -> VLAN Segment");
	  
	  
  }
  public void verify_updatedValues() throws InterruptedException	  
  {
	  System.out.println(verification_loaction);
	  Thread.sleep(10000);
	System.out.println(verification_locationName.getText());  
	  Assert.assertTrue(verification_loaction.equals(verification_locationName.getText()));
	  //Assert.assertTrue(verification_loaction.c);

  }
  
  

}
