package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHomePage {
	
	
	@FindBy(xpath= "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement newOrgButton;
	
	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewOrgbtn() {
		return newOrgButton;
	}
	/**
	 * business library to click on new organization button
	 */
	
	public void clickOnNewOrgButton() {
		newOrgButton.click();
	}
}
