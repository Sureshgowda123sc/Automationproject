package TC_Repo;

import org.testng.annotations.Test;

import Object_Repository.CreateNewLeadsPage;
import Object_Repository.Home_Page;
import Object_Repository.LeadsHomePage;
import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.Java_Utility;

public class LE_02 extends BaseClass {
	@Test
	public void le_02Case() throws Exception{
		Java_Utility JTUIL =new Java_Utility();
		int num =JTUIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		
		String FIRSTNAME=EUTIL.getIndividualTestDate("Leads", 4,1);
		String LASTNAME=EUTIL.getIndividualTestDate("Leads", 4,2);
		String COMPANY=EUTIL.getIndividualTestDate("Leads", 4,3);
		String TITLE=EUTIL.getIndividualTestDate("Leads", 4,4);
		String PHONE=EUTIL.getIndividualTestDate("Leads", 4,5);
		String MOBILE=EUTIL.getIndividualTestDate("Leads", 4,6);
		String EMAIL=EUTIL.getIndividualTestDate("Leads", 4,7);
		String NOE=EUTIL.getIndividualTestDate("Leads", 4,8);
		String STREET=EUTIL.getIndividualTestDate("Leads", 4,9);
		String POBOX=EUTIL.getIndividualTestDate("Leads", 4,10);
		String POSTALCODE=EUTIL.getIndividualTestDate("Leads", 4,11);
		String CITY=EUTIL.getIndividualTestDate("Leads", 4,12);
		String COUNTRY=EUTIL.getIndividualTestDate("Leads", 4,13);
		String STATE=EUTIL.getIndividualTestDate("Leads", 4,14);
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		CreateNewLeadsPage ch =new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME+num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE, STREET, POBOX, POSTALCODE, CITY, COUNTRY, STATE);
		Thread.sleep(3000);
		
		
		
	}
}
