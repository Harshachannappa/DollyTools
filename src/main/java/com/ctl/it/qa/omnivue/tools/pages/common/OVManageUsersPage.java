package com.ctl.it.qa.omnivue.tools.pages.common;

import java.util.ArrayList;
import java.util.List;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OVManageUsersPage extends OmniVuePage {

	@FindBy(xpath = "//a[@id='dropdownMenu1']/img")
	public WebElementFacade link_gearIcon;

	@FindBy(xpath = "//div[label[text()='FilterBy']]/select")
	public WebElementFacade ddl_filterBy;

	@FindBy(xpath = "//div[label[text()='Filter Text']]/input")
	public WebElementFacade tbx_filterText;

	@FindBy(xpath = "//input[@value='Search User']")
	public WebElementFacade btn_searchUser;

	@FindBy(xpath = "//a[text()='Manage Hierarchy']")
	public WebElementFacade tab_manageUsers;

	@FindBy(xpath = "//div[label[text()='First Name']]/following-sibling::div/label[2]")
	public WebElementFacade lbl_firstName;

	@FindBy(xpath = "//div[label[text()='First Name']]/following-sibling::div/label[3]")
	public WebElementFacade lbl_lastName;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-circle-arrow-right ng-binding']")
	public List<WebElementFacade> lbl_manageHierarchy;

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return link_gearIcon;
	}

	public void fillUserDetails(String filterBy, String filterText) {
		try {
			ddl_filterBy.selectByVisibleText(filterBy);
			tbx_filterText.sendKeys(filterText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void validate_ManagerHierarchyToVPLevel() {
		try {

			String firstName = lbl_firstName.getText().trim();
			System.out.println("firstName =" + firstName);

			String lastName = lbl_lastName.getText().trim();
			System.out.println("lastName =" + lastName);

			String userName = lastName + ", " + firstName;
			System.out.println("userName =" + userName);

			List<WebElementFacade> acutalList = lbl_manageHierarchy;
			ArrayList<String> atributesOfPage = new ArrayList<String>();
			for (int j = 0; j < acutalList.size(); j++) {
				atributesOfPage.add(j, acutalList.get(j).getText().trim());
			}

			System.out.println("atributesOfPage " + atributesOfPage);

			for (int i = 0; i < atributesOfPage.size(); i++) {
				if (atributesOfPage.get(i).equalsIgnoreCase(userName)) {

					System.out.println("User present in the Heirarchy");
					break;
				}

			}
			System.out.println("User not present in the Heirarchy");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
