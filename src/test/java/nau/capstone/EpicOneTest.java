package nau.capstone;

import org.testng.annotations.Test;

import utilities.Driver;
import utilities.TestBaseReport;

public class EpicOneTest extends TestBaseReport{

	public EpicOneTest() {
		// TODO Auto-generated constructor stub
	}
	  Login loginPage =new Login();

	 @Test
	    public void testCaseOne()  {
	         extentTest=extentReports.createTest("Epic One - TC001",
	              "User should be able to verify new post creation options.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseTwo()  {
	         extentTest=extentReports.createTest("Epic One - TC002",
	              "User should be able to create new post with .png file.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseThree()  {
	         extentTest=extentReports.createTest("Epic One - TC003",
	              "User should be able to create new post with a video recording.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFour()  {
	         extentTest=extentReports.createTest("Epic One - TC004",
	              "User should be able to select multiple files in a single post.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFive()  {
	         extentTest=extentReports.createTest("Epic One - TC005",
	              "User should NOT be able to create a new post when navigates to back.");
	         loginPage.loginInstagram();
	     
	         Driver.closeDriver();

	    }
}
