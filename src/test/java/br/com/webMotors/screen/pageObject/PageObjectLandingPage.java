package br.com.webMotors.screen.pageObject;

import org.openqa.selenium.By;

import br.com.webMotors.util.DSL;

public class PageObjectLandingPage extends DSL {
	static By by;
	
    public static void waitNavBarOption(String valueModel){
    	waitElement(By.xpath("//a[text() = '"+valueModel+"']"));
    }
    
    public static boolean getFoundCars(String value){
    	return waitElement(By.xpath("//div[@data-test-id='found-ads']/p[contains(text(), '" + value + "')]")).isDisplayed();
    }
}
