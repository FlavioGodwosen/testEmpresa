package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class CT02ValidarBotoesEAusenciaPainelIBTest {

    //Funcionalidade: Verificar ausência dos botões após clicar nos mesmos

    //Cenário: Clicar nos botões "One", "Two, e "Four" no painel ”IFRAME BUTTONS” e validar a ausência dos mesmos.

    //Dado que estou na mesma página
    //E clico nos botões "One", "Two, e "Four" no painel ”IFRAME BUTTONS”
    //Quando verifico os botões
    //Então os botões estão ausentes.

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
    public void ct02ValidarBotoesEAusenciaPainelIB() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://wejump-automation-test.github.io/qa-test/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("btn_one")).click();
        driver.findElement(By.id("btn_two")).click();
        driver.findElement(By.id("btn_link")).click();

        Thread.sleep(2000);
    }

}
