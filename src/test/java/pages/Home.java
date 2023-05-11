package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

public class Home extends BasePage{
	
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
    @FindBy(xpath = "//*[@aria-label='New post']")
    public WebElement newPost;
    @FindBy(xpath = "//*[@aria-label='Settings']")
    public WebElement settings;
    @FindBy(xpath = "//*[contains(@alt,'naucapstone2023')]/../../../../../../..//a")
    public WebElement profile;
    
    
    @FindBy(xpath = "//article[1]//a")
    public WebElement posts; 
    @FindBy(xpath = "//textarea[@aria-label='Add a comment…']")
    public WebElement comments;
    @FindBy(xpath = "//textarea[@aria-label='Add a comment…']")
    public WebElement likes;
    @FindBy(xpath = "(//textarea[@aria-label='Add a comment…'])[1]")
    public WebElement firstComment;
    @FindBy(xpath = "(//textarea[@aria-label='@naucapstone2023 '])[1]")
    public WebElement replyMyComment;
    @FindBy(xpath = "//div[text()='Post']")
    public WebElement postButton; 
    @FindBy(xpath = "//div[text()='Edit']")
    public WebElement editButton; 
  
    @FindBy(xpath = "//div[text()='naucapstone2023']/../../../../..//span[text()='Testing Comments1']")
    public WebElement testingPost1; 
    @FindBy(xpath = "//div[text()='naucapstone2023']/../../../../..//span[text()='Testing Comments2']")
    public WebElement testingPost2; 
    @FindBy(xpath = "//div[text()='naucapstone2023']/../../../../..//span[text()='Testing Comments3']")
    public WebElement testingPost3; 
  
    @FindBy(xpath = "(//article[1]//*[@aria-label='Comment']/../../../button)[1]")
    public WebElement firstPostCommentIcon;
    
    @FindBy(xpath = "(//article[1]//*[@aria-label='Like']/../../..//button)[1]")
    public WebElement firstPostLikeIcon;
    @FindBy(xpath = "//article[1]//*[@aria-label='Unlike']/../../../..//button")
    public WebElement firstPostUnLikeIcon;
    
    @FindBy(xpath = "(//article[1]//*[@aria-label='Like']/../../..//button)[last()]")
    public WebElement lastLikeIcon;
    @FindBy(xpath = "(//article[1]//*[@aria-label='Unlike']/../../../..//button)[last()]")
    public WebElement lastUnLikeIcon;
    
    @FindBy(xpath = "(//article[1]//*[@aria-label='Unlike']/../../..//button)[1]")
    public WebElement UnLikeIcon;
    @FindBy(xpath = "//article[1]//*[@aria-label='Like']/../../../..//button")
    public WebElement LikeIcon;
    
    
    public void navigateToHomePageMainOptions(String optionName) {    	
    	if (optionName.equals("Home")) {
    		home.click();
    	}else if (optionName.equals("Search")) {
    		search.click();
    	}else if (optionName.equals("Explore")) {
    		explore.click();
    	}else if (optionName.equals("Reels")) {
    		reels.click();
    	}else if (optionName.equals("Messenger")) {
    		messenger.click();
    	}else if (optionName.equals("Notifications")) {
    		notifications.click();
    	}else if (optionName.equals("New Post")) {
    		newPost.click();
    	}else if (optionName.equals("Settings")) {
    		settings.click();
    	}else if (optionName.equals("Profile")) {
    		profile.click();
    	}    	
    	
    }
    
    public void verifyHomePageMainOptions() {  
    	waitFor(1);
    	if(buttonNotNow.isDisplayed()) {
    		clickNotNowButton();
        	}
    		profile.click(); waitFor(2);
    		Log.info("User is able to navigate to Profile.");
    		home.click(); waitFor(2);
    		Log.info("User is able to navigate to Home.");
    		search.click();waitFor(2);
    		Log.info("User is able to navigate to Search.");    		
    		explore.click();waitFor(3);
    		Log.info("User is able to navigate to Explore.");    		
    		reels.click();waitFor(3);
    		Log.info("User is able to navigate to Reels.");    		
    		messenger.click();waitFor(2);
    		Log.info("User is able to navigate to Messenger.");    		
    		notifications.click(); waitFor(2); 
    		Log.info("User is able to navigate to Notifications.");    		
    		newPost.click();waitFor(2);
    		Log.info("User is able to navigate to New Post.");
    		clickClose();waitFor(2);
    		settings.click();waitFor(2);
    		Log.info("User is able to navigate to Settings.");
    		waitFor(2);
    	  	
    	
    }
    
    @SuppressWarnings("unchecked")
	public void commentSomeonesPost() {
    	 List<WebElement> postList =  (List<WebElement>) posts;
    	 List<WebElement> commentList =  (List<WebElement>) comments;

         for (int i=1; i<=postList.size(); i++) {
        	 if(!postList.get(i).getText().equals(ConfigReader.getProperty("profileName"))) {
        		 commentList.get(i).click();
        		 commentList.get(i).sendKeys("Testing Comments1");
        		 postButton.click();
     			break;
     		}             
         }    	
    }
    public void verifyCommentingPostText() {
   	 Assert.assertTrue(testingPost1.isDisplayed());    	
   }
    public void verifyNotAbleToEditComment() {
      	 Assert.assertFalse(editButton.isDisplayed());
      	Assert.assertFalse(editButton.isEnabled());
    }
    public void commentMyPost() {
   	 List<WebElement> postList =  (List<WebElement>) posts;
   	 List<WebElement> commentList =  (List<WebElement>) comments;

        for (int i=1; i<=postList.size(); i++) {
       	 if(postList.get(i).getText().equals(ConfigReader.getProperty("profileName"))) {
       		 commentList.get(i).click();
       		 commentList.get(i).sendKeys("Testing Comments1");
       		 postButton.click();
    			break;
    		}             
        }    	
   }
    
    public void makeCommentFromCommentIconAndVerify() {
    	firstPostCommentIcon.click();
    	firstComment.sendKeys("Testing Comments2");
    	postButton.click();
    	Assert.assertTrue(testingPost2.isDisplayed()); 
   }
    public void makeCommentOnMyCommentAndVerify() {
    	makeCommentFromCommentIconAndVerify();
    	clickReply();
    	replyMyComment.sendKeys("Testing Comments3");
    	postButton.click();
    	Assert.assertTrue(testingPost3.isDisplayed());
   }
    public void likeAPostAndVerify() {
    	firstPostLikeIcon.click();
    	Assert.assertTrue(firstPostUnLikeIcon.isDisplayed()); 
   }
    
    public void likeMyPost() {
      	 List<WebElement> postList =  (List<WebElement>) posts;
      	 List<WebElement> commentList =  (List<WebElement>) comments;

           for (int i=1; i<=postList.size(); i++) {
          	 if(postList.get(i).getText().equals(ConfigReader.getProperty("profileName"))) {
          		 commentList.get(i).click();
          		 
       			break;
       		}             
           }    	
      }
    public void likeAReplyAndVerify() {
    	lastLikeIcon.click();
    	Assert.assertTrue(lastUnLikeIcon.isDisplayed()); 
   }
    
    public void verifyDoubleClickOnLikeIcon() {
    	firstPostLikeIcon.click();
    	Assert.assertTrue(firstPostUnLikeIcon.isDisplayed()); 
    	UnLikeIcon.click();
    	Assert.assertTrue(LikeIcon.isDisplayed());
   }

}
