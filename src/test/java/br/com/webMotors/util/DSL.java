package br.com.webMotors.util;


import static br.com.webMotors.config.ConfigDriver.configDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DSL {

	protected WebDriver driver;
	protected static Wait<WebDriver> wait;

	public DSL() {
		this.driver = configDriver();
		wait = new FluentWait<WebDriver>(configDriver()).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class, WebDriverException.class);

	}

	protected WebElement waitElementVisibility(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	protected WebElement waitElementClickable(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	protected static WebElement waitElement(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	protected static void open(String url) {
		configDriver().navigate().to(url);
	}

	protected void setField(WebElement element, String text) {
		waitElementClickable(element).clear();
		element.sendKeys(text);
	}
	
	protected void clickElement(WebElement element) {
		waitElementClickable(element).click();
	}

	protected String getText(WebElement element) {
		return waitElementVisibility(element).getText();
	}
}

