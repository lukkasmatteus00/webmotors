package br.com.webMotors.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.webMotors.util.Util;


public final class ConfigDriver {
	static WebDriver driver;

	public static WebDriver configDriver() {
		if (driver == null) {
				System.setProperty("webdriver.chrome.driver", Util.pathChromeDriver());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
	}

	public static void finishDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
