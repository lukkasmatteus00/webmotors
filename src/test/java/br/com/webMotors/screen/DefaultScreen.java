package br.com.webMotors.screen;

import org.openqa.selenium.support.PageFactory;

import br.com.webMotors.config.ConfigDriver;


public class DefaultScreen {
	public DefaultScreen() {
		PageFactory.initElements(ConfigDriver.configDriver(), this);
	}

}
