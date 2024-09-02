package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadsPage {
	
	
	public CreateNewLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployees;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;

	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement  state;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement saveBtn;
	

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param com
	 */

	public void createLeads(String fName,String lName,String com) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(com);
		saveBtn.click();
		
	}
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param com
	 * @param desg
	 * @param phn
	 * @param mob
	 * @param mid
	 * @param noe
	 */
	public void createLeads(String fName,String lName,String com,String desg
			,String phn,String mob,String mid,String noe,String strt,String pobox, String pcode
			,String cty  ,String ctry ,String sta) {
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(com);
		title.sendKeys(desg);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		Email.sendKeys(mid);
		noOfEmployees.sendKeys(noe);
		street.sendKeys(strt);
		poBox.sendKeys(pobox);
		postalcode.sendKeys(pcode);
		city.sendKeys(cty);
		country.sendKeys(ctry);
		state.sendKeys(sta);
		saveBtn.click();
		
	
	}
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param com
	 * @param desg
	 * @param phn
	 * @param mob
	 * @param mid
	 * @param noe
	 */
	
	public void createLeads(String fName,String lName,String com,String desg
			,String phn,String mob,String mid,String noe) {
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(com);
		title.sendKeys(desg);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		Email.sendKeys(mid);
		noOfEmployees.sendKeys(noe);
		saveBtn.click();
		
	
	}
	
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param com
	 * @param strt
	 * @param pbox
	 * @param pcode
	 * @param cty
	 * @param cntry
	 * @param st
	 */
	
	public void createLeads(String fName,String lName,String com,
			String strt,String pbox,String pcode,String cty,String cntry,String st) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(com);
		street.sendKeys(strt);
		poBox.sendKeys(pbox);
		postalcode.sendKeys(pcode);
		city.sendKeys(cty);
		country.sendKeys(cntry);
		state.sendKeys(st);
		saveBtn.click();
		
	}


}
