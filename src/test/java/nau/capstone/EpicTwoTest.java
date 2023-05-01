package nau.capstone;

import org.testng.annotations.Test;

import utilities.Driver;
import utilities.TestBaseReport;

public class EpicTwoTest extends TestBaseReport{

	public EpicTwoTest() {
		// TODO Auto-generated constructor stub
	}
	  Login loginPage =new Login();

	 @Test
	    public void testCaseOne()  {
	         extentTest=extentReports.createTest("Epic Two - TC001",
	              "User should be able to click on like icon under any post on Home page.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseTwo()  {
	         extentTest=extentReports.createTest("Epic Two - TC002",
	              "User should be able to click on like icon on any story on the story line.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseThree()  {
	         extentTest=extentReports.createTest("Epic Two - TC003",
	              "User should be able to click on like icon on herself/himself post on Profile page");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFour()  {
	         extentTest=extentReports.createTest("Epic Two - TC004",
	              "Once User double clicks on like icon on a comment of any post.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFive()  {
	         extentTest=extentReports.createTest("Epic Two - TC005",
	              "User should NOT be able to like icon, once double clicks on like icon on any post");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
}
