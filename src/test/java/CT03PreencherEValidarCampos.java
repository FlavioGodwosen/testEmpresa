import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CT03PreencherEValidarCampos {
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
    public void cT03PreencherEValidarCampos() {
        driver.get("https://wejump-automation-test.github.io/qa-test/");
        driver.manage().window().setSize(new Dimension(912, 825));
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).sendKeys("Flavio Silva de Souza");
        driver.findElement(By.id("btn_one")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".checkbox:nth-child(9) > label"));
            assert(elements.size() > 0);
        }
        driver.findElement(By.id("select_box")).click();
        {
            WebElement dropdown = driver.findElement(By.id("select_box"));
            dropdown.findElement(By.xpath("//option[. = 'ExampleTwo']")).click();
        }
        driver.findElement(By.id("select_box")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".img-responsive-center-block:nth-child(4)"));
            assert(elements.size() > 0);
        }
    }


}
