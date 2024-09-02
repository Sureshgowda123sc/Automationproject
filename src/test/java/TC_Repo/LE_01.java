package TC_Repo;


import org.testng.annotations.Test;

import Object_Repository.CreateNewLeadsPage;
import Object_Repository.Home_Page;
import Object_Repository.LeadsHomePage;
import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.Java_Utility;

public class LE_01 extends BaseClass{
	@Test
	public void le_01Case() throws Exception{
		
		Java_Utility JUTIL =new Java_Utility();
		int num =JUTIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		
		
		String FIRSTNAME=EUTIL.getIndividualTestDate("Leads",1,1);
		String LASTNAME=EUTIL.getIndividualTestDate("Leads",1,2);
		String COMPANY=EUTIL.getIndividualTestDate("Leads",1,3);
		Thread.sleep(3000);
		
		
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		
		
		CreateNewLeadsPage ch = new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME+num, LASTNAME, COMPANY);
		System.out.println("test case1 Successfully!");
		
		Thread.sleep(3000);
		
		
		
		
	}
}

