package com.example.PracticeAutomation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.example.practiceautomation.po.FormFieldsPage;

public class FromFields {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	FormFieldsPage formPage;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		baseUrl = "https://practice-automation.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		
		formPage = new FormFieldsPage(driver);
	}
@Test
	public void testFormFields() throws Exception {
		driver.get("https://practice-automation.com/form-fields/");
		try {
			  FormFieldsPage formPage = PageFactory.initElements(driver, FormFieldsPage.class);

	            
			  assertEquals("Form Fields", formPage.getTitle().getText());

	            // Vérification du lien "Home"
	            assertEquals("Home", formPage.getHomeLink().getText());

	            // Vérification de l'étiquette du champ "Name"
	            assertEquals("Name",formPage.getNameLabel().getText());

	            // Interaction avec le champ "Name"
	            formPage.getNameInput().clear();
	            formPage.getNameInput().sendKeys("Islem");

	            // Vérification du message "Required"
	            assertTrue(formPage.getRequiredMessage().getText().matches("^[\\s\\S]* Required$"));

	            // Interaction avec le champ "Password"
	            formPage.getPasswordInput().clear();
	            formPage.getPasswordInput().sendKeys("123456");

	            // Vérification du libellé "What is your favorite drink?"
	            assertEquals("What is your favorite drink?", formPage.getFavoriteDrinkLabel().getText());

	            // Sélection des boissons
	            formPage.getDrink1().click();
	            Thread.sleep(500);
	            formPage.getDrink2().click();
	            Thread.sleep(500);
	            formPage.getDrink3().click();
	            Thread.sleep(500);
	            formPage.getDrink4().click();
	            Thread.sleep(500);
	            Actions actions = new Actions(driver);
	            actions.moveToElement(formPage.getDrink5()).click().perform();
	            Thread.sleep(500);

	            // Interaction avec les couleurs
	            actions.moveToElement(formPage.getColor1()).click().perform();
	            Thread.sleep(500);
	            actions.moveToElement(formPage.getColor2()).click().perform();
	            Thread.sleep(500);
	            actions.moveToElement(formPage.getColor3()).click().perform();
	            Thread.sleep(500);
	            actions.moveToElement(formPage.getColor4()).click().perform();
	            Thread.sleep(500);
	            actions.moveToElement(formPage.getColor5()).click().perform();
	            Thread.sleep(500);

	            // Interaction avec le menu déroulant "Automation"
	            WebElement automationDropdown = formPage.getAutomationDropdown();
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", automationDropdown);
	            Thread.sleep(500);
	            new Select(automationDropdown).selectByVisibleText("Yes");
	            Thread.sleep(500);
	            new Select(automationDropdown).selectByVisibleText("No");
	            Thread.sleep(500);
	            new Select(automationDropdown).selectByVisibleText("Undecided");
	            Thread.sleep(500);

	            // Vérification des options de framework
	            assertEquals("Selenium", formPage.getSeleniumOption().getText());
	            assertEquals("Playwright", formPage.getPlaywrightOption().getText());
	            assertEquals("Cypress", formPage.getCypressOption().getText());
	            assertEquals("Appium", formPage.getAppiumOption().getText());
	            assertEquals("Katalon Studio", formPage.getKatalonStudioOption().getText());

	            // Interaction avec le champ email
	            formPage.getEmailInput().clear();
	            formPage.getEmailInput().sendKeys("Souihi.islem@gmail.com");

	            // Interaction avec le champ message
	            formPage.getMessageInput().clear();
	            formPage.getMessageInput().sendKeys("hello world");

	            // Vérification du bouton de soumission
	            assertEquals("Submit", formPage.getSubmitButton().getText());
	            formPage.getSubmitButton().click();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
