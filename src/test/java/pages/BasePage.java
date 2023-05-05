package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
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

}
