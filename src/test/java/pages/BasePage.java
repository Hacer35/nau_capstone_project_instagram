package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class BasePage {
	
	public BasePage()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	

	Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Driver driver= new Driver();
    
	 @FindBy(xpath = "//div[text()='Next']")
	    public WebElement nextButton;    
	    @FindBy(xpath = "//button[text()='Back']")
	    public WebElement backButton;    
	    @FindBy(xpath = "//button[text()='Discard']")
	    public WebElement discardButton;
	    @FindBy(xpath = "//div[text()='Share']")
	    public WebElement shareButton; 
	    @FindBy(xpath = "//div[text()='Send']")
	    public WebElement sendButton; 
	    @FindBy(xpath = "//*[@aria-label='Close']")
	    public WebElement closeButton; 
	    @FindBy(xpath = "(//span[text()='Relpy'])[1]")
	    public WebElement replyButton; 
	    @FindBy(xpath = "//div[text()='Not Now']")
	    public WebElement notNowButton;
	    @FindBy(xpath = "//button[text()='Not Now']")
	    public WebElement buttonNotNow;
	
	public void clickNext() {
    	nextButton.click();
    }
    public void clickBack() {
    	backButton.click();
    }
    public void clickShare() {
    	shareButton.click();
    }
    public void clickClose() {
    	closeButton.click();
    }
    public void clickDiscard() {
    	discardButton.click();
    }
    public void clickReply() {
    	replyButton.click();
    }
    public void clickSend() {
    	sendButton.click();
    }
    public void clickNotNow() {
    	notNowButton.click();
    }
    public void clickNotNowButton() {
    	buttonNotNow.click();
    }
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
