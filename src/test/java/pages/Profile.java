package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Driver;

public class Profile extends BasePage{ 


	public Profile() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Driver driver= new Driver();
       
    @FindBy(xpath = "(//article//div[1]//a)[1]")
    public WebElement myLastPost; 
    @FindBy(xpath = "(//article[1]//*[@aria-label='Like']/../../..//button)[1]")
    public WebElement myLastPostLikeIcon;
    @FindBy(xpath = "//article[1]//*[@aria-label='Unlike']/../../../..//button")
    public WebElement myLastPostUnLikeIcon;
    
    public void navigateToMyLastPost() {
    	myLastPost.click();
    }
    
    public void likeMyPostAndVerify() {
    	myLastPostLikeIcon.click();
    	Assert.assertTrue(myLastPostUnLikeIcon.isDisplayed());
    	clickClose();
    }
}
