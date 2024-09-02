package Object_Repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	/**
	 * this is POM class for login operation
	 * 
	 * @author UDAY version 1.8.24
	 */

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name=\"user_password\"]")
	private WebElement password;

	@FindBy(xpath = "//input[@id=\"submitButton\"]")
	private WebElement loginbtn;

	public Login_Page(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	/**
	 * this is business library to do login operation
	 * 
	 * @param uname
	 * @param pass
	 */

	public void LoginOperation(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();

	}
}

