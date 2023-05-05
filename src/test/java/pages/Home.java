package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Home {
	
	public Home() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Driver driver= new Driver();
       
    @FindBy(xpath = "//*[@aria-label='Home']")
    public WebElement home;
    @FindBy(xpath = "//*[@aria-label='Search']")
    public WebElement search;
    @FindBy(xpath = "//*[@aria-label='Explore']")
    public WebElement explore;
    @FindBy(xpath = "//*[@aria-label='Reels']")
    public WebElement reels;
    @FindBy(xpath = "//*[@aria-label='Messenger']")
    public WebElement messenger;
    @FindBy(xpath = "//*[@aria-label='Notifications']")
    public WebElement notifications;
    @FindBy(xpath = "//*[@aria-label='New Post']")
    public WebElement newPost;
    @FindBy(xpath = "//*[@aria-label='Settings']")
    public WebElement settings;
   
 
    
    public void navigateToHomePageMainOptions(String optionName) {    	
    	switch (optionName) {
    	case "Home":
    		home.click();
    	case "Search":
    		search.click();
    	case "Explore":
    		explore.click();
    	case "Reels":
    		reels.click();
    	case "Messenger":
    		messenger.click();
    	case "Notifications":
    		notifications.click();
    	case "New Post":
    		newPost.click();
    	case "Settings":
    		settings.click();
    	}    	
    	
    }

}
