package com.example.practiceautomation.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormFieldsPage {



	 public FormFieldsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h1[@itemprop='headline']")
	    private WebElement title;

	    @FindBy(linkText = "Home")
	    private WebElement homeLink;

	    @FindBy(xpath = "//*[@id=\"feedbackForm\"]/label[1]")
	    private WebElement nameLabel;

	    @FindBy(id = "name-input")
	    private WebElement nameInput;

	    @FindBy(xpath = "//form[@id='feedbackForm']/p")
	    private WebElement requiredMessage;

	    @FindBy(xpath = "//input[@type='password']")
	    private WebElement passwordInput;

	    @FindBy(xpath = "//form[@id='feedbackForm']/label[3]")
	    private WebElement favoriteDrinkLabel;

	    @FindBy(id = "drink1")
	    private WebElement drink1;

	    @FindBy(id = "drink2")
	    private WebElement drink2;

	    @FindBy(id = "drink3")
	    private WebElement drink3;

	    @FindBy(id = "drink4")
	    private WebElement drink4;

	    @FindBy(id = "drink5")
	    private WebElement drink5;

	    @FindBy(id = "color1")
	    private WebElement color1;

	    @FindBy(id = "color2")
	    private WebElement color2;

	    @FindBy(id = "color3")
	    private WebElement color3;

	    @FindBy(id = "color4")
	    private WebElement color4;

	    @FindBy(id = "color5")
	    private WebElement color5;

	    @FindBy(id = "automation")
	    private WebElement automationDropdown;

	    @FindBy(xpath = "//form[@id='feedbackForm']/ul/li[1]")
	    private WebElement seleniumOption;

	    @FindBy(xpath = "//form[@id='feedbackForm']/ul/li[2]")
	    private WebElement playwrightOption;

	    @FindBy(xpath = "//form[@id='feedbackForm']/ul/li[3]")
	    private WebElement cypressOption;

	    @FindBy(xpath = "//form[@id='feedbackForm']/ul/li[4]")
	    private WebElement appiumOption;

	    @FindBy(xpath = "//form[@id='feedbackForm']/ul/li[5]")
	    private WebElement katalonStudioOption;

	    @FindBy(id = "email")
	    private WebElement emailInput;

	    @FindBy(id = "message")
	    private WebElement messageInput;

	    @FindBy(id = "submit-btn")
	    private WebElement submitButton;

		public WebElement getTitle() {
			return title;
		}

		public void setTitle(WebElement title) {
			this.title = title;
		}

		public WebElement getHomeLink() {
			return homeLink;
		}

		public void setHomeLink(WebElement homeLink) {
			this.homeLink = homeLink;
		}

		public WebElement getNameLabel() {
			return nameLabel;
		}

		public void setNameLabel(WebElement nameLabel) {
			this.nameLabel = nameLabel;
		}

		public WebElement getNameInput() {
			return nameInput;
		}

		public void setNameInput(WebElement nameInput) {
			this.nameInput = nameInput;
		}

		public WebElement getRequiredMessage() {
			return requiredMessage;
		}

		public void setRequiredMessage(WebElement requiredMessage) {
			this.requiredMessage = requiredMessage;
		}

		public WebElement getPasswordInput() {
			return passwordInput;
		}

		public void setPasswordInput(WebElement passwordInput) {
			this.passwordInput = passwordInput;
		}

		public WebElement getFavoriteDrinkLabel() {
			return favoriteDrinkLabel;
		}

		public void setFavoriteDrinkLabel(WebElement favoriteDrinkLabel) {
			this.favoriteDrinkLabel = favoriteDrinkLabel;
		}

		public WebElement getDrink1() {
			return drink1;
		}

		public void setDrink1(WebElement drink1) {
			this.drink1 = drink1;
		}

		public WebElement getDrink2() {
			return drink2;
		}

		public void setDrink2(WebElement drink2) {
			this.drink2 = drink2;
		}

		public WebElement getDrink3() {
			return drink3;
		}

		public void setDrink3(WebElement drink3) {
			this.drink3 = drink3;
		}

		public WebElement getDrink4() {
			return drink4;
		}

		public void setDrink4(WebElement drink4) {
			this.drink4 = drink4;
		}

		public WebElement getDrink5() {
			return drink5;
		}

		public void setDrink5(WebElement drink5) {
			this.drink5 = drink5;
		}

		public WebElement getColor1() {
			return color1;
		}

		public void setColor1(WebElement color1) {
			this.color1 = color1;
		}

		public WebElement getColor2() {
			return color2;
		}

		public void setColor2(WebElement color2) {
			this.color2 = color2;
		}

		public WebElement getColor3() {
			return color3;
		}

		public void setColor3(WebElement color3) {
			this.color3 = color3;
		}

		public WebElement getColor4() {
			return color4;
		}

		public void setColor4(WebElement color4) {
			this.color4 = color4;
		}

		public WebElement getColor5() {
			return color5;
		}

		public void setColor5(WebElement color5) {
			this.color5 = color5;
		}

		public WebElement getAutomationDropdown() {
			return automationDropdown;
		}

		public void setAutomationDropdown(WebElement automationDropdown) {
			this.automationDropdown = automationDropdown;
		}

		public WebElement getSeleniumOption() {
			return seleniumOption;
		}

		public void setSeleniumOption(WebElement seleniumOption) {
			this.seleniumOption = seleniumOption;
		}

		public WebElement getPlaywrightOption() {
			return playwrightOption;
		}

		public void setPlaywrightOption(WebElement playwrightOption) {
			this.playwrightOption = playwrightOption;
		}

		public WebElement getCypressOption() {
			return cypressOption;
		}

		public void setCypressOption(WebElement cypressOption) {
			this.cypressOption = cypressOption;
		}

		public WebElement getAppiumOption() {
			return appiumOption;
		}

		public void setAppiumOption(WebElement appiumOption) {
			this.appiumOption = appiumOption;
		}

		public WebElement getKatalonStudioOption() {
			return katalonStudioOption;
		}

		public void setKatalonStudioOption(WebElement katalonStudioOption) {
			this.katalonStudioOption = katalonStudioOption;
		}

		public WebElement getEmailInput() {
			return emailInput;
		}

		public void setEmailInput(WebElement emailInput) {
			this.emailInput = emailInput;
		}

		public WebElement getMessageInput() {
			return messageInput;
		}

		public void setMessageInput(WebElement messageInput) {
			this.messageInput = messageInput;
		}

		public WebElement getSubmitButton() {
			return submitButton;
		}

		public void setSubmitButton(WebElement submitButton) {
			this.submitButton = submitButton;
		}
}
