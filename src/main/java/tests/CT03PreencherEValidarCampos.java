package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class CT03PreencherEValidarCampos {

    //Funcionalidade: Verificar ausência dos botões após clicar nos mesmos

    //Cenário: Clicar nos botões "One", "Two, e "Four" no painel ”IFRAME BUTTONS” e validar a ausência dos mesmos.

    //Dado que estou na mesma página
    //E preencho o campo “YourFirstName” com um texto, clico no botão “One”,
    //E checo a opção”OptionThree”,
    //Quando seleciono a opção “ExempleTwo” dentro da select box
    //Então valido a imagem logo do “Selenium Webdriver”.

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new Utils().getDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void ct03PreencherEValidarCampos() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://wejump-automation-test.github.io/qa-test/");
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).sendKeys("Flavio Silva de Souza");
        driver.findElement(By.id("btn_one")).click();

        Thread.sleep(2000);
    }
}
