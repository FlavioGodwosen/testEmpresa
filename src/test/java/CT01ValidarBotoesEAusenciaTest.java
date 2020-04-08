import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CT01ValidarBotoesEAusenciaTest {

    //Funcionalidade: Verificar ausência dos botões após clicar nos mesmos

    //Cenário: Clicar nos botões "One", "Two, e "Four", depois verificar a ausência dos mesmos.

    //Dado que estou na página WeJump-automation
    //E clico nos botões "One", "Two, e "Four"
    //Quando verifico os botões
    //Então os botões estão ausentes.



    private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }
        @After
        public void tearDown() {
            driver.quit();
        }
        @Test
        public void cT01ValidarBotoesEAusencia() {
            driver.get("https://wejump-automation-test.github.io/qa-test/");
            driver.manage().window().setSize(new Dimension(917, 774));
            driver.findElement(By.id("btn_one")).click();
            driver.findElement(By.id("btn_two")).click();
            driver.findElement(By.id("btn_link")).click();
            {
                List<WebElement> elements = driver.findElements(By.id("btn_one"));
                assert(elements.size() > 0);
            }
            {
                List<WebElement> elements = driver.findElements(By.id("btn_two"));
                assert(elements.size() > 0);
            }
            {
                List<WebElement> elements = driver.findElements(By.id("btn_link"));
                assert(elements.size() > 0);
            }
        }
    }



