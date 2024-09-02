package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsHomePage {
	
	@FindBy(xpath="(//a[@href='index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing'])[1]")
	
	
	private WebElement createNewLeadsButton;
	
	
	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewLeadButton() {
		return createNewLeadsButton;
	}
	
	/**
	 * this is the business library to click on new btn
	 */
	
	public void clickOnNewLeadsButton() {
		createNewLeadsButton.click();
	}

}