package generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import Object_Repository.Home_Page;
import Object_Repository.Login_Page;

public class BaseClass {
	public WebDriver driver=null;
	Selenium_Utility SUTIL= null;
	Properties_Utility PUTIL= new Properties_Utility();
	
	@BeforeSuite
	public void createConnetion() {
		System.out.println("Connetion Established");
		
	}
	@BeforeClass(alwaysRun = true)
	public void launchingBrowser() throws Exception {
		
		String URL=	PUTIL.getDataFromProperties("url");
		SUTIL =new Selenium_Utility();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		SUTIL.implicitWait(driver, 10);
		
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("Launching Successfully!! ");
	}
	@BeforeMethod(alwaysRun = true)
	public void loginApp() throws Exception {
		
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD= PUTIL.getDataFromProperties("password");
		
		Login_Page ip=new Login_Page(driver);
		ip.LoginOperation(USERNAME, PASSWORD);
		
		System.out.println("Login Successfully!! ");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutApp() throws Exception {
		Home_Page hp =new Home_Page(driver);
		hp.logoutOpretaion(driver);
		
	}
	@AfterClass(alwaysRun = true)
	public void closeApp() {
		driver.quit();
		System.out.println("Logout Successfully!! ");
		
	}
	@AfterSuite(alwaysRun = true)
	public void closeCennection() {
		System.out.println("Connection Colsed Successfully!! ");
		
	}
}
