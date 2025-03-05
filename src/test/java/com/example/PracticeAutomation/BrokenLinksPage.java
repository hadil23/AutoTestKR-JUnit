package com.example.PracticeAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.example.practiceautomation.po.PageObject;

public class BrokenLinksPage extends PageObject{

	

	public BrokenLinksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public WebElement getMissingPageText() {
		return missingPageText;
	}

	public void setMissingPageText(WebElement missingPageText) {
		this.missingPageText = missingPageText;
	}

	public WebElement getQuatreQuatrePageText() {
		return quatreQuatrePageText;
	}

	public void setQuatreQuatrePageText(WebElement quatreQuatrePageText) {
		this.quatreQuatrePageText = quatreQuatrePageText;
	}

	public WebElement getNameText() {
		return nameText;
	}

	public void setNameText(WebElement nameText) {
		this.nameText = nameText;
	}

	public WebElement getStatusText() {
		return statusText;
	}

	public void setStatusText(WebElement statusText) {
		this.statusText = statusText;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public void setHomeLink(WebElement homeLink) {
		this.homeLink = homeLink;
	}

	

	
	
	  public WebElement getTitle() {
		return title;
	}


	public void setTitle(WebElement title) {
		this.title = title;
	}


	public WebElement getIdealScenario() {
		return idealScenario;
	}


	public void setIdealScenario(WebElement idealScenario) {
		this.idealScenario = idealScenario;
	}



	@FindBy(xpath = "//div[@id='top-wrap']/section/div/h1")
	    private WebElement title;
	  
	  @FindBy(xpath = "//a[normalize-space()='Home']")
	    private WebElement homeLink;

	  @FindBy(xpath = "//article[@id='post-1267']/div/p[2]")
	    private WebElement idealScenario;
	  
	  @FindBy(xpath = "//article[@id='post-1267']/div/p[3]")
	    private WebElement quatreQuatrePageText;

	    @FindBy(xpath = "//td[@class='has-text-align-left'][1]")
	    private WebElement missingPageText;

	  
	    @FindBy(xpath = "//th[@class='has-text-align-left'][1]")
	    private WebElement nameText;

	    @FindBy(xpath = "//th[@class='has-text-align-left'][2]")
	    private WebElement statusText;

	   

	   

}
