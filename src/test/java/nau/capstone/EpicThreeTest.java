package nau.capstone;

import org.testng.annotations.Test;

import utilities.Driver;
import utilities.TestBaseReport;

public class EpicThreeTest extends TestBaseReport{

	public EpicThreeTest() {
		// TODO Auto-generated constructor stub
	}
	  Login loginPage =new Login();

	 @Test
	    public void testCaseOne()  {
	         extentTest=extentReports.createTest("Epic Three - TC001",
	              "User should be able to comment on someone else's post.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseTwo()  {
	         extentTest=extentReports.createTest("Epic Three - TC002",
	              "User should be able to comment on herself/himelf post.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseThree()  {
	         extentTest=extentReports.createTest("Epic Three - TC003",
	              "User should be able to comment on a comment.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFour()  {
	         extentTest=extentReports.createTest("Epic Three - TC004",
	              "User should be able to comment on a story.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFive()  {
	         extentTest=extentReports.createTest("Epic Three - TC005",
	              "User should NOT be able to edit any comment.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
}
