package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class CT01ValidarBotoesEAusenciaTest {

    //Funcionalidade: Verificar ausência dos botões após clicar nos mesmos

    //Cenário: Clicar nos botões "One", "Two, e "Four", depois verificar a ausência dos mesmos.

    //Dado que estou na página WeJump-automation
    //E clico nos botões "One", "Two, e "Four"
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
    public void ct01ValidarBotoesEAusencia() {
        driver.get("https://wejump-automation-test.github.io/qa-test/");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn_one")).click();
        driver.findElement(By.id("btn_two")).click();
        driver.findElement(By.id("btn_link")).click();
    }
}






