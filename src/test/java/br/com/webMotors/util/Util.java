package br.com.webMotors.util;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.text.Normalizer;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.webMotors.config.ConfigDriver;

/**
 Tem como objetivo criar metodos que será que auxiliaram toda a estrutura do projeto
 **/
public class Util {
    public static Util wait(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Util();
    }

    public static String removeAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

    public static String pathChromeDriver(){
        return new File("src\\test\\resources\\driver\\chromedriver.exe").getAbsolutePath();
    }

    public static void checkValues(String valorEsperado, String valorObtido){
        assertEquals(
                Util.removeAccent(valorEsperado),
                Util.removeAccent(valorObtido)
        );
    }

    public static WebElement findElementXPath(WebDriver driver, String xpath){
        return driver.findElement(By.xpath(xpath));
    }
    
    public static WebElement findElementCSSSelector(WebDriver driver, String css){
        return driver.findElement(By.cssSelector(css));
    }
   
    public static void exception(Exception e) {
    	System.out.println("Algo deu errado" + e.getMessage());
		ConfigDriver.finishDriver();
		fail("Foi lançado alguma exceção durante o teste!!!");
    }
}

