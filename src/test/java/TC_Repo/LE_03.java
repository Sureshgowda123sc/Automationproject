package TC_Repo;

import org.testng.annotations.Test;

import Object_Repository.CreateNewLeadsPage;
import Object_Repository.Home_Page;
import Object_Repository.LeadsHomePage;
import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.Java_Utility;

public class LE_03 extends BaseClass {
	@Test
	public void le_03Case() throws Exception{
		Java_Utility JTUIL =new Java_Utility();
		int num =JTUIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		String FIRSTNAME=EUTIL.getIndividualTestDate("leads", 7,1);
		String LASTNAME=EUTIL.getIndividualTestDate("leads", 7,2);
		String COMPANY=EUTIL.getIndividualTestDate("leads",7,3);
		String TITLE=EUTIL.getIndividualTestDate("leads", 7,4);
		String PHONE=EUTIL.getIndividualTestDate("leads", 7,5);
		String MOBILE=EUTIL.getIndividualTestDate("leads", 7,6);
		String EMAIL=EUTIL.getIndividualTestDate("leads", 7,7);
		String NOE=EUTIL.getIndividualTestDate("leads", 7,8);
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		CreateNewLeadsPage ch =new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE);
		Thread.sleep(3000);
		
		
		
	}
}