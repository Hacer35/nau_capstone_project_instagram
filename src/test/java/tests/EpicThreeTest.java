package tests;

import org.testng.annotations.Test;

import pages.Home;
import pages.Login;
import pages.NewPost;
import pages.Story;
import utilities.Driver;
import utilities.TestBaseReport;

public class EpicThreeTest extends TestBaseReport{

	public EpicThreeTest() {
		// TODO Auto-generated constructor stub
	}
	Login loginPage =new Login();
	  Home homePage =new Home();
	  NewPost newPostPage =new NewPost();
	  Story storyPage =new Story();

	 @Test
	    public void testCaseOne()  {
	         extentTest=extentReports.createTest("Epic Three - TC001",
	              "User should be able to comment on someone else's post on Home Page.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         homePage.commentSomeonesPost();
	         homePage.verifyCommentingPostText();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseTwo()  {
	         extentTest=extentReports.createTest("Epic Three - TC002",
	              "User should be able to comment on herself/himelf post on Home Page.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         homePage.commentMyPost();
	         homePage.verifyCommentingPostText();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseThree()  {
	         extentTest=extentReports.createTest("Epic Three - TC003",
	              "User should be able to comment on a comment.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         homePage.makeCommentOnMyCommentAndVerify();	
	         homePage.clickClose();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFour()  {
	         extentTest=extentReports.createTest("Epic Three - TC004",
	              "User should be able to comment on a story.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         storyPage.navigateToFirstStoryOnHomePage();
	         storyPage.commentToFirstStoryOnHomePage();
	         homePage.navigateToHomePageMainOptions("Messages");
	         storyPage.verifyStoryCommentFromMessages();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFive()  {
	         extentTest=extentReports.createTest("Epic Three - TC005",
	              "User should NOT be able to edit any comment.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         homePage.commentSomeonesPost();
	         homePage.verifyNotAbleToEditComment();	         
	         Driver.closeDriver();

	    }
}
