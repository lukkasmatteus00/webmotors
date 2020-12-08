package br.com.webMotors.screen;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingScreen extends DefaultScreen{
	@FindBy(xpath = "//div[@class='CarouselContainer__wrap']/a[@class='CardMake']")
	public List<WebElement> listMake;
	
	@FindBy(xpath = "//div[contains(text(),'Todos os modelos')]")
	public WebElement elementOptionModel;
	
	@FindBy(xpath = "//a[@class='Filters__line Filters__line__result']")
	public List<WebElement> listOption;
	
	@FindBy(xpath = "//div[contains(text(),'Todas as versões')]")
	public WebElement elementOptionVersion;
	
	@FindBy(xpath = "//h1[@class='title-search']")
	public WebElement waitForTitleSeach;
		
	@FindBy(xpath = "//a[@class='NavBar--item is--active']")
	public WebElement waitForNavBarCar;
	
	@FindBy(xpath = "//div[@class='Slide SlideLeft SlideLeft--opened']//div[@class='Filters__container__title']")
	public WebElement waitForModel;
	
	@FindBy(xpath = "//button[text() = 'OK']")
	public WebElement buttonOk;
	
	
	//Validação de elementos
	@FindBy(xpath = "//div[@data-test-id='found-ads']/p")
	public WebElement foundCars;
	
	@FindBy(xpath = "//div[@data-test-id='found-ads']/p/strong")
	public WebElement numbersCars;
	
	@FindBy(xpath = "//div[@class='sc-jbKcbu cyMRVT']/h3")
	public List<WebElement> versionCars;
	
	@FindBy(xpath = "//div[@class='sc-jbKcbu cyMRVT']/h2")
	public List<WebElement> makeCars;
	
}
