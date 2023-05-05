package tests;

import org.testng.annotations.Test;

import pages.Home;
import pages.Login;
import pages.NewPost;
import pages.Story;
import pages.Profile;
import utilities.Driver;
import utilities.TestBaseReport;

public class EpicTwoTest extends TestBaseReport{

	public EpicTwoTest() {
		// TODO Auto-generated constructor stub
	}
	  Login loginPage =new Login();
	  Home homePage =new Home();
	  NewPost newPostPage =new NewPost();
	  Story storyPage =new Story();
	  Profile profilePage =new Profile();

	 @Test
	    public void testCaseOne()  {
	         extentTest=extentReports.createTest("Epic Two - TC001",
	              "User should be able to click on like icon under any post on Home page.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         homePage.likeAPostAndVerify();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseTwo()  {
	         extentTest=extentReports.createTest("Epic Two - TC002",
	              "User should be able to click on like icon on any story on the story line.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         storyPage.navigateToFirstStoryOnHomePage();
	         storyPage.likeFirstStoryOnHomePageAndVerify();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseThree()  {
	         extentTest=extentReports.createTest("Epic Two - TC003",
	              "User should be able to click on like icon on herself/himself post on Profile page");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Profile");
	         profilePage.navigateToMyLastPost();
	         profilePage.likeMyPostAndVerify();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFour()  {
	         extentTest=extentReports.createTest("Epic Two - TC004",
	              "User should be able to click on like icon on a comment reply.");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         homePage.makeCommentOnMyCommentAndVerify();	
	         homePage.likeAReplyAndVerify();
	         Driver.closeDriver();

	    }
	 @Test
	    public void testCaseFive()  {
	         extentTest=extentReports.createTest("Epic Two - TC005",
	              "User should NOT be able to like icon, once double clicks on like icon on any post");
	         loginPage.loginInstagram();
	         homePage.navigateToHomePageMainOptions("Home");
	         homePage.verifyDoubleClickOnLikeIcon();
	         Driver.closeDriver();

	    }
}
