package com.java.practiceautomation.bdd;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.example.practiceautomation.po.ClickEventsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsClickEvents {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	ClickEventsPage clickEvents;

	@Given("I am in page click events")
	public void i_am_in_page_click_evens() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("start-maximized");
		  options.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(options);
		  baseUrl = "https://practice-automation.com/";
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  js = (JavascriptExecutor) driver;
		clickEvents = new ClickEventsPage(driver);
		driver.get("https://practice-automation.com/click-events/");
	}

	@When("I click for the cat")
	public void i_click_for_the_animal() {
		clickEvents.getBtnCat().click();
	}

	@Then("I verify the cat sound displayed")
	public void i_verify_the_sound_displayed() {
		assertEquals("Meow!", clickEvents.getMsgCat().getText());
	}

	@When("I click for the Dog")
	public void i_click_for_the_dog() {
		clickEvents.getBtnDog().click();
	}

	@Then("I verify the Dog sound displayed")
	public void i_verify_the_dog_sound_displayed() {
		assertEquals("Woof!", clickEvents.getMsgDog().getText());
	}

	@When("I click for the Pig")
	public void i_click_for_the_pig() {
		clickEvents.getBtnPig().click();
	}

	@Then("I verify the Pig sound displayed")
	public void i_verify_the_pig_sound_displayed() {
		assertEquals("Oink!", clickEvents.getMsgPig().getText());

	}

	@When("I click for the Cow")
	public void i_click_for_the_cow() {
		clickEvents.getBtnCow().click();
	}

	@Then("I verify the Cow sound displayed")
	public void i_verify_the_cow_sound_displayed() {
		assertEquals("Moo!", clickEvents.getMsgCow().getText());
	}
	
	
	@When("I click for the {string}")
	public void i_click_for_the(String animal) {
		driver.findElement(By.xpath("//button[@onclick='"+animal+"Sound()']")).click();
	}

	@Then("I verify the {string} displayed")
	public void i_verify_the_displayed(String sound) {
		assertEquals(sound, clickEvents.getMsgAnimal().getText());	
	}
	
	

	/*
	 * @Given("I am in page click evens") public void i_am_in_page_click_evens() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\Java\\chromedriver.exe"); ChromeOptions options = new
	 * ChromeOptions(); options.addArguments("start-maximized");
	 * options.addArguments("--remote-allow-origins=*"); driver = new
	 * ChromeDriver(options);
	 * driver.get("https://practice-automation.com/click-events/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); js =
	 * (JavascriptExecutor) driver; clickEvents = new ClickEventsPage(driver); }
	 * 
	 * @When("I click for the cat") public void i_click_for_the_cat() {
	 * clickEvents.getBtnCat().click(); }
	 * 
	 * @Then("I verify the Meow! displayed") public void
	 * i_verify_the_meow_displayed() { assertEquals("Meow!",
	 * clickEvents.getMsgCat().getText()); }
	 * 
	 * @When("I click for the dog") public void i_click_for_the_dog() {
	 * clickEvents.getBtnDog().click(); }
	 * 
	 * @Then("I verify the Woof! displayed") public void
	 * i_verify_the_woof_displayed() { assertEquals("Woof!",
	 * clickEvents.getMsgDog().getText()); }
	 * 
	 * @When("I click for the pig") public void i_click_for_the_pig() {
	 * clickEvents.getBtnPig().click(); }
	 * 
	 * @Then("I verify the Oink! displayed") public void
	 * i_verify_the_oink_displayed() { assertEquals("Oink!",
	 * clickEvents.getMsgPig().getText()); }
	 * 
	 * @When("I click for the cow") public void i_click_for_the_cow() {
	 * clickEvents.getBtnCow().click(); }
	 * 
	 * @Then("I verify the Moo! displayed") public void i_verify_the_moo_displayed()
	 * { assertEquals("Moo!", clickEvents.getMsgCow().getText()); }
	 */

	
	
	
	
	
	
	
	
	/*
	@Given("I am in page click events")
	public void i_am_in_page_click_events() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		baseUrl = "https://practice-automation.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		clickEvents = new ClickEventsPage(driver);
	}

	@When("I click for the {string}")
	public void i_click_for_the(String animal) {
		String xpathExpression = "//button[@onclick='" + animal.toLowerCase() + "Sound()']";
		WebElement animalButton = driver.findElement(By.xpath(xpathExpression));
		animalButton.click();

	}

	@Then("I verify the {string} displayed")
	public void i_verify_the_displayed(String sound) {
		assertEquals(sound, clickEvents.getMsgAnimal().getText());
	}
	*/

}
