package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Driver;

public class Story extends BasePage {
	
	public Story() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Driver driver= new Driver();
       
    @FindBy(xpath = "(//button[contains(@aria-label,'Story by')])[1]")
    public WebElement firstStoryOnHomePage; 
    
    @FindBy(xpath = "(//textarea[contains(@placeholder,'Reply to')])")
    public WebElement replyOnStory; 
    
    @FindBy(xpath = "(//span[contains(text(),'You: Testing Commenting Story')])")
    public WebElement storyCommentText; 
    
    @FindBy(xpath = "(//*[@aria-label='Like']/../../..//button)")
    public WebElement likeOnStory; 
    @FindBy(xpath = "//*[@aria-label='Unlike']/../../../..//button")
    public WebElement firstStoryUnLikeIcon;
    
    
    
    public void navigateToFirstStoryOnHomePage() {
    	firstStoryOnHomePage.click();
    }
    public void commentToFirstStoryOnHomePage() {
    	replyOnStory.sendKeys("Testing Commenting Story");
    	clickSend();
    	clickClose();
    }
    public void verifyStoryCommentFromMessages() {
    	Assert.assertTrue(storyCommentText.isDisplayed());
    }
    public void likeFirstStoryOnHomePageAndVerify() {
    	likeOnStory.click();
    	Assert.assertTrue(firstStoryUnLikeIcon.isDisplayed());
    	clickClose();
    }
  
    
    
    
    
	
	

}
