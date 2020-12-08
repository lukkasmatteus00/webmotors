package br.com.webMotors.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebElement;

import br.com.webMotors.config.ConfigDriver;
import br.com.webMotors.screen.LandingScreen;
import br.com.webMotors.screen.pageObject.PageObjectLandingPage;
import br.com.webMotors.util.DSL;
import br.com.webMotors.util.Util;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepDefinitionRealizarPesquisa extends DSL {
	LandingScreen landingScreen;

	public StepDefinitionRealizarPesquisa() {
		super();
	}

	@Dado("que desejo acessar o site da WebMotors")
	public void queDesejoAcessarSiteNaPaginaDeBusca() {
		landingScreen = new LandingScreen();
		open("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
	}

	@Quando("acionar a {string} do carro")
	public void acionarMarcaDoCarro(String valueMake) {
		
		waitElementVisibility(landingScreen.waitForTitleSeach);
		clickElement(landingScreen.buttonOk);

		for (WebElement make : landingScreen.listMake) {
			if (getText(make).equals(valueMake)) {
				clickElement(make);
				break;
			}
		}
	}

	@Então("escolher o {string}")
	public void escolherModelo(String valueModel) {

		waitElementVisibility(landingScreen.waitForTitleSeach);
		clickElement(landingScreen.elementOptionModel);
		PageObjectLandingPage.waitNavBarOption(valueModel);
		
		for (WebElement model : landingScreen.listOption) {
			if (getText(model).equals(valueModel)) {
				clickElement(model);
				break;
			}
		}
	}

	@Então("escolher a {string}")
	public void aVersaoDoVeiculo(String valueVersion) {

		waitElementVisibility(landingScreen.waitForNavBarCar);
		clickElement(landingScreen.elementOptionVersion);

		PageObjectLandingPage.waitNavBarOption(valueVersion);
		
		for (WebElement version : landingScreen.listOption) {
			if (getText(version).equals(valueVersion)) {
				clickElement(version);
				break;
			}

		}
	}

	@Então("deve retornar a quantidade de veiculos")
	public void deveRetornarQuantidadeDeVeiculos() {
		waitElementVisibility(landingScreen.waitForTitleSeach);
		assertTrue(PageObjectLandingPage.getFoundCars("carros encontrados"));
		assertTrue((Integer.valueOf(getText(landingScreen.numbersCars).replace(".", ""))) > 0);
		
	}
	
	@Então("as opções de  {string} , {string} e {string} que foram informados na busca")
	public void asOpcoesDeMarcaMmodeloVversaoQueForamInformadosNaBusca(String make, String model, String version) {
		//Validando o nome e modelo do carro
		String makeAndMogel = make + " " + model;
		for (WebElement makeCar : landingScreen.makeCars) {
			Util.checkValues(getText(makeCar), makeAndMogel.toUpperCase());
		}
		
		//Validando a versão do carro
		for (WebElement versionCar : landingScreen.versionCars) {
			Util.checkValues(getText(versionCar), version.toUpperCase());
		}
		
		ConfigDriver.finishDriver();
	}
}
