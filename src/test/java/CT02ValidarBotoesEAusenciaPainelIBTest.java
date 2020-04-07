import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CT02ValidarBotoesEAusenciaPainelIBTest {
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
    public void cT02ValidarBotoesEAusenciaPainelIB() {
        driver.get("https://wejump-automation-test.github.io/qa-test/");
        driver.manage().window().setSize(new Dimension(917, 774));
        driver.switchTo().frame(0);
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
